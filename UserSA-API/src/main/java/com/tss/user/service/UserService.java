package com.tss.user.service;

import java.util.List;

import com.tss.user.entity.UserEntity;
import com.tss.user.pojo.UserPojo;

public interface UserService {

	String addUser(UserPojo userPojo);
	List<UserEntity> getAllUsers();
	boolean isUserEmailIdExists(String userEmailId);
	boolean isUserContactNumberExists(long userContactNumber);
	String verfyUser(String userEmailId,String userPassword);
	String deleteUser(String userEmailId);
	UserPojo getUser(String userEmailId);
}
