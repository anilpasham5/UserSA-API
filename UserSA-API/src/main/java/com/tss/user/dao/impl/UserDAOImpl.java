package com.tss.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tss.user.dao.UserDAO;
import com.tss.user.entity.UserEntity;
import com.tss.user.repository.UserRepository;
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String addUser(UserEntity userEntity) {
		if(userRepository.save(userEntity)!=null) return "YES";
		return "FAILED";
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public boolean isUserEmailIdExists(String userEmailId) {
		return userRepository.isUserEmailExists(userEmailId)!=null;
	}

	@Override
	public boolean isUserContactNumberExists(long userContactNumber) {
		return userRepository.isUserContactNumberExists(userContactNumber)!=null;
	}

	@Override
	public String verifyUser(String userEmailId, String userPassword) {
		UserEntity userEntity=userRepository.isUserEmailExists(userEmailId);
		if(userEntity==null) return "EmailId doesn't exists... Please Register";
		else ;
		return null;
	}

	@Override
	public String deleteUser(String userEmailId) {
		userRepository.deleteUser(userEmailId);
		return userEmailId+" DELETED";
	}

	@Override
	public UserEntity getUser(String userEmailId) {
		return userRepository.isUserEmailExists(userEmailId);
	}

}
