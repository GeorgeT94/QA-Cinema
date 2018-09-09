package com.qa.cinema.business;

import com.qa.cinema.business.dto.AdminDto;

import java.util.List;

public interface AdminService {
    AdminDto loginAdmin(String username, String password) ;
    void saveAdmin(AdminDto adminDto);
    List<AdminDto> getAllAdmins();
    void deleteAdmin(Integer id);
}
