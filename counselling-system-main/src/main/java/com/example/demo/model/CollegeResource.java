package com.example.demo.model;

import java.util.List;

public class CollegeResource {
    private String id;
    private String name;
    private String location;
    private String type;
    private double rating;
    private String campusVideo;
    private String virtualTour;
    private String officialWebsite;
    private List<DepartmentLink> departmentLinks;
    private List<AlumniProfile> alumniProfiles;
    private SocialMedia socialMedia;
    private List<String> highlights;
    private String admissionBrochure;
    private String placementReport;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCampusVideo() {
        return campusVideo;
    }

    public void setCampusVideo(String campusVideo) {
        this.campusVideo = campusVideo;
    }

    public String getVirtualTour() {
        return virtualTour;
    }

    public void setVirtualTour(String virtualTour) {
        this.virtualTour = virtualTour;
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite;
    }

    public List<DepartmentLink> getDepartmentLinks() {
        return departmentLinks;
    }

    public void setDepartmentLinks(List<DepartmentLink> departmentLinks) {
        this.departmentLinks = departmentLinks;
    }

    public List<AlumniProfile> getAlumniProfiles() {
        return alumniProfiles;
    }

    public void setAlumniProfiles(List<AlumniProfile> alumniProfiles) {
        this.alumniProfiles = alumniProfiles;
    }

    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    public String getAdmissionBrochure() {
        return admissionBrochure;
    }

    public void setAdmissionBrochure(String admissionBrochure) {
        this.admissionBrochure = admissionBrochure;
    }

    public String getPlacementReport() {
        return placementReport;
    }

    public void setPlacementReport(String placementReport) {
        this.placementReport = placementReport;
    }
}
