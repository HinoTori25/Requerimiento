package com.unmsm.software.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.unmsm.software.model.UserModel;
import com.unmsm.software.serviceimpl.UserServiceImpl;

@Controller
@ManagedBean(name="userController")
@ViewScoped
public class UserController {
	private List<UserModel> users;
	
	@Autowired 
	UserServiceImpl userService;
	
    @PostConstruct
    public void init() {
    	System.out.println("gg");
    	users = userService.listarUsers();
    }
    
	public List<UserModel> getUsers() {
		return users;
	}

	public void setUsers(List<UserModel> users) {
		this.users = users;
	}
	
	
	
	
}
