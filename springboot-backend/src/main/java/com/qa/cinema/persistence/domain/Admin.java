package com.qa.cinema.persistence.domain;

import javax.persistence.*;

@Entity
@Table
public class Admin {

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer adminID;
    @Column
    private String adminName;
    @Column
    private String adminPassword;

    public Admin(){}
    public Admin(String adminName, String adminPassword){
        this.adminName=adminName;
        this.adminPassword=adminPassword;
    }

    public Integer getAdminID() {
        return adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
