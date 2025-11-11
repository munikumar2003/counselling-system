package com.example.demo.service;

import com.example.demo.model.CutoffDetails;
import com.example.demo.model.GateCollegeDto;
import com.example.demo.model.*;
import com.example.demo.repository.GateCollegeRepository;
import com.example.demo.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class GateCollegeService {

    @Autowired
    private GateCollegeRepository repo;

    @Autowired
    private UserProfileRepository userProfileRepo;

    public List<GateCollegeDto> getEligibleColleges(CollegeFilterRequest req) {

        List<GateCollege> allColleges = repo.findAll();
        List<GateCollegeDto> eligibleColleges = new ArrayList<>();

        for (GateCollege college : allColleges) {
            List<CutoffGate> cutoffs = college.getCutoffs();
            List<String> eligibleBranches = new ArrayList<>();

            for (String requestedBranch : req.getSelectedBranches()) {
                Optional<CutoffGate> matchingCutoff = cutoffs.stream()
                        .filter(cutoff -> cutoff.getBranchName().equalsIgnoreCase(requestedBranch))
                        .findFirst();

                if (matchingCutoff.isPresent()) {
                    Double categoryCutoff = getCategoryCutoffValue(matchingCutoff.get(), req.getCategory().toLowerCase());
                    System.out.println(req.getScore()+" "+categoryCutoff);
                    if (categoryCutoff != null && req.getScore()>= categoryCutoff) {
                        eligibleBranches.add(requestedBranch);
                    }
                }
            }


            if (!eligibleBranches.isEmpty()) {
                GateCollegeDto dto = new GateCollegeDto();

                dto.setId(college.getId());
                dto.setName(college.getName());
                dto.setLocation(college.getLocation());
                dto.setType(college.getType());
                dto.setRating(college.getRating());
                dto.setFees(college.getFees());
                dto.setNirfRanking(college.getNirfRanking());
                dto.setEstablished(college.getEstablished());
                dto.setSeats(college.getSeats());
                dto.setPopularityScore(college.getPopularityScore());

                List<String> branchNames = college.getBranches().stream()
                        .filter(b -> eligibleBranches.contains(b.getBranchName()))
                        .map(BranchGate::getBranchName)
                        .collect(Collectors.toList());
                dto.setBranches(branchNames);

                Map<String, CutoffDetails> cutoffMap = new HashMap<>();
                for (CutoffGate cutoff : cutoffs) {
                    if (eligibleBranches.contains(cutoff.getBranchName())) {
                        CutoffDetails details = new CutoffDetails();
                        details.setGeneral(cutoff.getGeneral());
                        details.setObc(cutoff.getObc());
                        details.setSc(cutoff.getSc());
                        details.setSt(cutoff.getSt());
                        details.setEws(cutoff.getEws());
                        cutoffMap.put(cutoff.getBranchName(), details);
                    }
                }
                dto.setCutoffs(cutoffMap);

                List<String> highlightStrings = college.getHighlights().stream()
                        .map(HighlightGate::getHighlight)
                        .collect(Collectors.toList());
                dto.setHighlights(highlightStrings);

                eligibleColleges.add(dto);
            }
        }
        return eligibleColleges;
    }

    private Double getCategoryCutoffValue(CutoffGate cutoff, String category) {
        return switch (category) {
            case "general" -> cutoff.getGeneral();
            case "obc" -> cutoff.getObc();
            case "sc" -> cutoff.getSc();
            case "st" -> cutoff.getSt();
            case "ews" -> cutoff.getEws();
            default -> null;
        };
    }
}


