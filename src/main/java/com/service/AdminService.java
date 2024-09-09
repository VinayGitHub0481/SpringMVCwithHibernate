package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.AdminImp;
import com.admin.Admin;

@Service
public class AdminService {
     @Autowired
	private AdminImp adminImp;
	public int s1(Admin ad) {
		int i=this.adminImp.save(ad);
		return i;
		
	}
	public AdminImp getAdminImp() {
		return adminImp;
	}
	public void setAdminImp(AdminImp adminImp) {
		this.adminImp = adminImp;
	}
}
