package com.tss.user.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="user")
public class UserEntity {
    
	@Id
	private String userId;
	private String userFirstName;
	private String userLastName;
	@Indexed(background=true,unique=true)
	private String userEmailId;
	private long userContactNumber;
	private Date userDOB;
	private String userToken;
	private String userStatus;
	private String userPassword;
	
	public UserEntity() {}
	public UserEntity(String userId, String userFirstName, String userLastName, String userEmailId,
			long userContactNumber, Date userDOB, String userToken, String userStatus, String userPassword) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmailId = userEmailId;
		this.userContactNumber = userContactNumber;
		this.userDOB = userDOB;
		this.userToken = userToken;
		this.userStatus = userStatus;
		this.userPassword = userPassword;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public long getUserContactNumber() {
		return userContactNumber;
	}
	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}
	public Date getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmailId=" + userEmailId + ", userContactNumber=" + userContactNumber + ", userDOB=" + userDOB
				+ ", userToken=" + userToken + ", userStatus=" + userStatus + ", userPassword=" + userPassword + "]";
	}		
	
}
