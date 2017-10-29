package io.abhinavlabs.ahp_algorithm.Model.Pojos;


public class ApplicantAttributes {

    private int applicantNumber ;
    private String applicantName ;
    private boolean workFactorConfidence ;
    private boolean workFactorCompatibility ;
    private boolean workFactorAge ;
    private boolean academicFactorExperience ;
    private boolean academicFactorTechnical ;
    private boolean academicFactorResearch ;
    private boolean individualFactorUG ;
    private boolean individualFactorPG;
    private boolean individualFactorCommunication ;
    private boolean individualFactorPresentation ;

    public ApplicantAttributes(int applicantNumber, String applicantName) {
        this.applicantNumber = applicantNumber;
        this.applicantName = applicantName;
    }

    public ApplicantAttributes(int applicantNumber, String applicantName, boolean workFactorConfidence, boolean workFactorCompatibility, boolean workFactorAge, boolean academicFactorExperience, boolean academicFactorTechnical, boolean academicFactorResearch, boolean individualFactorUG, boolean individualFactorPG, boolean individualFactorCommunication, boolean individualFactorPresentation) {
        this.applicantNumber = applicantNumber;
        this.applicantName = applicantName;
        this.workFactorConfidence = workFactorConfidence;
        this.workFactorCompatibility = workFactorCompatibility;
        this.workFactorAge = workFactorAge;
        this.academicFactorExperience = academicFactorExperience;
        this.academicFactorTechnical = academicFactorTechnical;
        this.academicFactorResearch = academicFactorResearch;
        this.individualFactorUG = individualFactorUG;
        this.individualFactorPG = individualFactorPG;
        this.individualFactorCommunication = individualFactorCommunication;
        this.individualFactorPresentation = individualFactorPresentation;
    }


    public int getApplicantNumber() {
        return applicantNumber;
    }

    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public boolean isWorkFactorConfidence() {
        return workFactorConfidence;
    }

    public void setWorkFactorConfidence(boolean workFactorConfidence) {
        this.workFactorConfidence = workFactorConfidence;
    }

    public boolean isWorkFactorCompatibility() {
        return workFactorCompatibility;
    }

    public void setWorkFactorCompatibility(boolean workFactorCompatibility) {
        this.workFactorCompatibility = workFactorCompatibility;
    }

    public boolean isWorkFactorAge() {
        return workFactorAge;
    }

    public void setWorkFactorAge(boolean workFactorAge) {
        this.workFactorAge = workFactorAge;
    }

    public boolean isAcademicFactorExperience() {
        return academicFactorExperience;
    }

    public void setAcademicFactorExperience(boolean academicFactorExperience) {
        this.academicFactorExperience = academicFactorExperience;
    }

    public boolean isAcademicFactorTechnical() {
        return academicFactorTechnical;
    }

    public void setAcademicFactorTechnical(boolean academicFactorTechnical) {
        this.academicFactorTechnical = academicFactorTechnical;
    }

    public boolean isAcademicFactorResearch() {
        return academicFactorResearch;
    }

    public void setAcademicFactorResearch(boolean academicFactorResearch) {
        this.academicFactorResearch = academicFactorResearch;
    }

    public boolean isIndividualFactorUG() {
        return individualFactorUG;
    }

    public void setIndividualFactorUG(boolean individualFactorUG) {
        this.individualFactorUG = individualFactorUG;
    }

    public boolean isIndividualFactorPG() {
        return individualFactorPG;
    }

    public void setIndividualFactorPG(boolean individualFactorPG) {
        this.individualFactorPG = individualFactorPG;
    }

    public boolean isIndividualFactorCommunication() {
        return individualFactorCommunication;
    }

    public void setIndividualFactorCommunication(boolean individualFactorCommunication) {
        this.individualFactorCommunication = individualFactorCommunication;
    }

    public boolean isIndividualFactorPresentation() {
        return individualFactorPresentation;
    }

    public void setIndividualFactorPresentation(boolean individualFactorPresentation) {
        this.individualFactorPresentation = individualFactorPresentation;
    }
}
