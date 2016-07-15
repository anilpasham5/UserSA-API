package com.tss.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tss.user.dao.UserDAO;
import com.tss.user.entity.UserEntity;
import com.tss.user.pojo.UserPojo;
import com.tss.user.service.UserService;
import com.tss.utility.Generator;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public String addUser(UserPojo userPojo) {
		// TODO Auto-generated method stub
		UserEntity userEntity=new UserEntity();
		userEntity.setUserContactNumber(userPojo.getUserContactNumber());
		userEntity.setUserDOB(userPojo.getUserDOB());
		userEntity.setUserEmailId(userPojo.getUserEmailId());
		userEntity.setUserFirstName(userPojo.getUserFirstName());
		userEntity.setUserLastName(userPojo.getUserLastName());
		userEntity.setUserToken(Generator.generateToken());
		userEntity.setUserStatus("INACTIVE");
		userEntity.setUserPassword(userPojo.getUserPassword());
		String string=userDAO.addUser(userEntity);
		if(string.equals("YES")){
		  //String activationLink="";
		  
		}
		return string;
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Override
	public boolean isUserEmailIdExists(String userEmailId) {
		return userDAO.isUserEmailIdExists(userEmailId);
	}

	@Override
	public boolean isUserContactNumberExists(long userContactNumber) {
		return userDAO.isUserContactNumberExists(userContactNumber);
	}

	@Override
	public String verfyUser(String userEmailId, String userPassword) {
		return userDAO.verifyUser(userEmailId, userPassword);
	}

	@Override
	public String deleteUser(String userEmailId) {
		return userDAO.deleteUser(userEmailId);
	}

	@Override
	public UserPojo getUser(String userEmailId) {
		UserEntity userEntity=userDAO.getUser(userEmailId);
		UserPojo userPojo=new UserPojo();
		userPojo.setUserContactNumber(userEntity.getUserContactNumber());
		userPojo.setUserDOB(userEntity.getUserDOB());
		userPojo.setUserEmailId(userEntity.getUserEmailId());
		userPojo.setUserFirstName(userEntity.getUserFirstName());
		userPojo.setUserLastName(userEntity.getUserLastName());
		userPojo.setUserPassword(userEntity.getUserPassword());
		return userPojo;
	}

}
