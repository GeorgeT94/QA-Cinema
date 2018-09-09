package com.qa.cinema.business.dto;

public class AdminDto {

    private Integer adminID;
    private String adminName;
    private String adminPassword;

    public AdminDto(){}
    public AdminDto(Integer adminID, String adminName, String adminPassword){
        this.adminID=adminID;
        this.adminName=adminName;
        this.adminPassword=adminPassword;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String getAdminName() {
        return adminName;
    }

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }
}
