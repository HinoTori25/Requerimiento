package com.unmsm.software.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.unmsm.software.model.UserModel;

public interface ejemplo {

	@Select("select user,password from user")
	public List<UserModel> getUsers();
}
