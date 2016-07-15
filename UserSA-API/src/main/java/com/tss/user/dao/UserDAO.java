package com.tss.user.dao;

import java.util.List;

import com.tss.user.entity.UserEntity;

public interface UserDAO {

	String addUser(UserEntity userEntity);
	List<UserEntity> getAllUsers();
	boolean isUserEmailIdExists(String userEmailId);
	boolean isUserContactNumberExists(long userContactNumber);
	String verifyUser(String userEmailId,String userPassword);
	String deleteUser(String userEmailId);
	UserEntity getUser(String userEmailId);
}
