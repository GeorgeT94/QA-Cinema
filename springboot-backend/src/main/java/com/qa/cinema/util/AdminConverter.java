package com.qa.cinema.util;

import com.qa.cinema.business.dto.AdminDto;
import com.qa.cinema.persistence.domain.Admin;

public class AdminConverter {
    public static Admin dtoToEntity(AdminDto adminDto) {
        Admin admin = new Admin(adminDto.getAdminName(), adminDto.getAdminPassword());
        admin.setAdminID(adminDto.getAdminID());
        return admin;
    }

    public static AdminDto entityToDto(Admin admin) {
        AdminDto adminDto = new AdminDto(admin.getAdminID(),admin.getAdminName(), admin.getAdminPassword());
        return adminDto;
    }
}
