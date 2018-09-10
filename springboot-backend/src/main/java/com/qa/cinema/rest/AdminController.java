package com.qa.cinema.rest;

import com.qa.cinema.business.AdminService;
import com.qa.cinema.business.dto.AdminDto;
import com.qa.cinema.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(Constants.ADMIN)
@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @CrossOrigin
    @RequestMapping(Constants.LOGIN_ADMIN)
    public AdminDto loginAdmin(@PathVariable String adminName,@PathVariable String adminPassword){
        return adminService.loginAdmin(adminName,adminPassword);
    }

    @CrossOrigin
    @RequestMapping(value= Constants.SAVE_ADMIN, method= RequestMethod.POST)
    public void saveFilm(@RequestBody AdminDto adminDto) {
        adminService.saveAdmin(adminDto);
    }

    @CrossOrigin
    @RequestMapping(Constants.GET_ALL_ADMIN)
    public List<AdminDto> getAllFilms() {
        return adminService.getAllAdmins();
    }

    @CrossOrigin
    @RequestMapping(value=Constants.DELETE, method = RequestMethod.DELETE)
    public void deleteAdmin(@PathVariable Integer id) {
        adminService.deleteAdmin(id);
    }


}
