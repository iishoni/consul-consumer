package com.iishoni.consulconsumer.web;

import com.iishoni.consulconsumer.service.AdminService;
import com.iishoni.model.Admin;
import com.iishoni.web.view.Page;
import com.iishoni.web.view.ResponseVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @GetMapping("/getAdminList")
    public ResponseVo<Page<Admin>> getAdminList(
            @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        ResponseVo<Page<Admin>> responseVo = adminService.getAdminList(pageNum, pageSize);
        return responseVo;
    }

    @PostMapping("/saveAdmin")
    public ResponseVo saveAdmin(@RequestBody Admin admin) {
        ResponseVo responseVo = adminService.saveAdmin(admin);
        return responseVo;
    }

    @GetMapping("/getAdminInfo/{adminId}")
    public ResponseVo<Admin> getAdminInfo(@PathVariable Long adminId) {
        ResponseVo<Admin> responseVo = adminService.getAdminInfo(adminId);
        return responseVo;
    }

    @PutMapping("/updateAdmin")
    public ResponseVo updateAdmin(@RequestBody Admin admin) {
        ResponseVo responseVo = adminService.updateAdmin(admin);
        return responseVo;
    }

    @DeleteMapping("/deleteAdmin/{adminId}")
    public ResponseVo deleteAdmin(@PathVariable Long adminId) {
        ResponseVo responseVo = adminService.deleteAdmin(adminId);
        return responseVo;
    }
}

