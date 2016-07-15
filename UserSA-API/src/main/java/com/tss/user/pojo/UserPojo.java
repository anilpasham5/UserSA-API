package com.tss.user.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonRootName;
@JsonRootName("user")
public class UserPojo {

	private String userFirstName;
	private String userLastName;
	private String userEmailId;
	private long userContactNumber;
	private Date userDOB;
	private String userPassword;
	public UserPojo() {}
	public UserPojo(String userFirstName, String userLastName, String userEmailId, long userContactNumber, Date userDOB,
			String userPassword) {
		super();
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmailId = userEmailId;
		this.userContactNumber = userContactNumber;
		this.userDOB = userDOB;
		this.userPassword = userPassword;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserPojo [userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", userEmailId="
				+ userEmailId + ", userContactNumber=" + userContactNumber + ", userDOB=" + userDOB + ", userPassword="
				+ userPassword + "]";
	}
	
}
