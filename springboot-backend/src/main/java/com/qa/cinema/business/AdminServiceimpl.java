package com.qa.cinema.business;

import com.qa.cinema.business.dto.AdminDto;
import com.qa.cinema.persistence.AdminRepository;
import com.qa.cinema.persistence.domain.Admin;
import com.qa.cinema.util.AdminConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceimpl implements AdminService{

    @Autowired
    AdminRepository adminRepository;

    @Override
    public AdminDto loginAdmin(String username, String password) {
        return AdminConverter.entityToDto(adminRepository.findByAdminNameEqualsAndAdminPasswordEquals(username, password));
    }

    @Override
    public void saveAdmin(AdminDto adminDto) {
        adminRepository.save(AdminConverter.dtoToEntity(adminDto));
    }

    @Override
    public List<AdminDto> getAllAdmins() {
        return adminRepository.findAll().stream().map(AdminConverter::entityToDto).collect(Collectors.toList());
    }

    @Override
    public void deleteAdmin(Integer id){
        adminRepository.delete(id);
    }
}
