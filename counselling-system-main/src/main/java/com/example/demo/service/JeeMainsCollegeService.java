package com.example.demo.service;

import com.example.demo.model.CutoffDetails;
import com.example.demo.model.JeeMainsCollegeDto;
import com.example.demo.model.*;
import com.example.demo.repository.JeeMainsCollegeRepository;
import com.example.demo.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class JeeMainsCollegeService {

    @Autowired
    private JeeMainsCollegeRepository repo;

    @Autowired
    private UserProfileRepository userProfileRepo;

    public List<JeeMainsCollegeDto> getEligibleColleges(CollegeFilterRequest req) {
        System.out.println(req.getUserId());
        UserProfile userProfile = userProfileRepo.findByUserId(req.getUserId());
        String userState = (userProfile != null) ? userProfile.getState() : null;
        System.out.println(userState);

        List<JeeMainsCollege> allColleges = repo.findAll();
        List<JeeMainsCollegeDto> eligibleColleges = new ArrayList<>();

        for (JeeMainsCollege college : allColleges) {
            List<Cutoff> cutoffs = college.getCutoffs();
            List<String> eligibleBranches = new ArrayList<>();

            //List<String> eligibleBranches = new ArrayList<>();

            for (String requestedBranch : req.getSelectedBranches()) {
                Optional<Cutoff> matchingCutoff = cutoffs.stream()
                        .filter(cutoff -> cutoff.getBranchName().equalsIgnoreCase(requestedBranch)
                                && cutoff.isHs() == req.isHomeState()) // ✅ match based on Home State
                        .findFirst();

                if (matchingCutoff.isPresent()) {
                    Double categoryCutoff = getCategoryCutoffValue(matchingCutoff.get(), req.getCategory().toLowerCase());
                    //System.out.println(req.getScore()+" "+categoryCutoff);
                    if (categoryCutoff != null && req.getScore() <= categoryCutoff) {
                        eligibleBranches.add(requestedBranch);
                    }
                }
            }


            if (!eligibleBranches.isEmpty()) {
                JeeMainsCollegeDto dto = new JeeMainsCollegeDto();

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

                // Branches as List<String>
                List<String> branchNames = college.getBranches().stream()
                        .filter(b -> eligibleBranches.contains(b.getBranchName()))
                        .map(Branch::getBranchName)
                        .collect(Collectors.toList());
                dto.setBranches(branchNames);

                // Cutoffs as Map<String, CutoffDetails>
                Map<String, CutoffDetails> cutoffMap = new HashMap<>();
                for (Cutoff cutoff : cutoffs) {
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

                // Highlights as List<String>
                List<String> highlightStrings = college.getHighlights().stream()
                        .map(Highlight::getHighlight)
                        .collect(Collectors.toList());
                dto.setHighlights(highlightStrings);

                eligibleColleges.add(dto);
            }
        }
        return eligibleColleges;
    }

    private Double getCategoryCutoffValue(Cutoff cutoff, String category) {
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
