package com.tss.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tss.user.HomeController;
import com.tss.user.entity.UserEntity;
import com.tss.user.pojo.UserPojo;
import com.tss.user.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="",method=RequestMethod.POST,headers="content-type=application/json")
	public void addUser(@RequestBody UserPojo userPojo,
			HttpServletResponse response,HttpServletRequest request){
		logger.info(userPojo.toString());
		String string=userService.addUser(userPojo);
		logger.info("Add User Final message: "+string);
		if(string.equals("YES")) {
			try {
				response.sendRedirect(request.getContextPath()+"/login.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<UserEntity> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/emailexistance",method=RequestMethod.POST)
	public String isEmailIdExists(@RequestParam("userEmailId") String userEmailId){
		logger.info("User EmailId: "+userEmailId);
		if(userService.isUserEmailIdExists(userEmailId)) return "EmailId Already Exists...";
		return "";
	}
	
	@RequestMapping(value="/contactnumberexistence",method=RequestMethod.POST)
	public String isContactNumberExists(@RequestParam("userContactNumber") long userContactNumber){
		logger.info("User Contact Number: "+userContactNumber);
		if(userService.isUserContactNumberExists(userContactNumber)) return "Mobile Number Already Exists...";
		return "";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public void verifyUser(@RequestParam("userEmailId") String userEmailId,
			               @RequestParam("userPassword") String userPassword,
			               HttpServletResponse response){
		logger.info(userEmailId+" "+userPassword);
		String string=userService.verfyUser(userEmailId, userPassword);
		logger.info(string);
	}
	@RequestMapping(value="/{userEmailId}",method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable("userEmailId") String userEmailId){
		if(!userEmailId.endsWith(".com")) userEmailId=userEmailId+".com";
		logger.info(userEmailId);
		return userService.deleteUser(userEmailId);
	}
	
	@RequestMapping(value="/{userEmailId}",method=RequestMethod.GET,
			        produces="application/json")
	public UserPojo getUser(@PathVariable("userEmailId") String userEmailId){
		if(!userEmailId.endsWith(".com")) userEmailId=userEmailId+".com";
		logger.info(userEmailId);
		return userService.getUser(userEmailId);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public String updateUser(@RequestBody UserPojo userPojo){
		logger.info(userPojo.toString());
		return "Updated ";
	}
}
