package com.unmsm.software.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unmsm.software.model.UserModel;
import com.unmsm.software.persistence.ejemplo;
@Service
public class UserServiceImpl {
	
	
	@Autowired  
	ejemplo ejemploInterface;


	public List<UserModel> listarUsers() {
		// TODO Auto-generated method stub
		return ejemploInterface.getUsers();
	}
	public static void main (String [ ] args) {
		 
        UserServiceImpl impl= new UserServiceImpl();
        System.out.println(impl.listarUsers().toString());

}
}
