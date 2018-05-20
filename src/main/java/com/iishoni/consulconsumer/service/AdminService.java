package com.iishoni.consulconsumer.service;

import com.iishoni.consulconsumer.feign.AdminFeign;
import com.iishoni.model.Admin;
import com.iishoni.web.view.Page;
import com.iishoni.web.view.ResponseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {

    @Resource
    private AdminFeign adminFeign;

    public ResponseVo<Admin> getAdminInfo(Long adminId) {
        return adminFeign.getAdminInfo(adminId);
    }

    public ResponseVo saveAdmin(Admin admin) {
        return adminFeign.saveAdmin(admin);
    }

    public ResponseVo updateAdmin(Admin admin) {
        return adminFeign.updateAdmin(admin);
    }

    public ResponseVo deleteAdmin(Long adminId) {
        return adminFeign.deleteAdmin(adminId);
    }

    public ResponseVo<Page<Admin>> getAdminList(Integer pageNum, Integer pageSize) {
        return adminFeign.getAdminList(pageNum,pageSize);
    }
}
