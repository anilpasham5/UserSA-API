<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<body>
<div ng-app="myApps" ng-controller="myCtrls" align="center">
<h3 style="color: green;">User Registration</h3><br>
<form action="./user" method="post" name="user" onsubmit="return validate()">
<table align="center">
<tr>
   <td><label>Enter First Name:</label></td>
   <td>
   <input class="well well-sm" name="userFirstName" ng-pattern="/^[A-z ]{4,25}$/" ng-model="userFirstName" required>
   <span style="color: red;" ng-show="user.userFirstName.$error.pattern">Name Should be min 4 chars max 16</span>
   </td>
</tr>
<tr>
   <td><label>Enter Last Name:</label></td>
   <td>
   <input class="well well-sm" name="userLastName" ng-pattern="/^[A-z ]{4,25}$/" ng-model="userLastName" required>
   <span style="color: red;" ng-show="user.userLastName.$error.pattern">Name Min 4 max 25</span>
   </td>
</tr>
<tr>
   <td><label>Enter EmailId:</label></td>
   <td>
   <input class="well well-sm"  name="userEmailId" ng-model="userEmailId" 
   ng-pattern="/^([A-z0-9!@#$_.]{4,25})@([A-z0-9]{4,25}).com$/" onchange="checkEmail(this.value)" required>
   <span style="color: red;" ng-show="user.userEmailId.$error.pattern">EmailId must be in ----@----.com format only</span>
   <span style="color: red;" id="eidTxt"></span>
   </td>
</tr>
<tr>
   <td><label>Enter Mobile Number:</label></td>
   <td>
   <input class="well well-sm" name="userContactNumber" ng-model="userContactNumber" 
   ng-pattern="/^[0-9]{10}$/" onchange="checkContactNumber(this.value)" required>
   <span style="color: red;" ng-show="user.userContactNumber.$error.pattern">Invalid Contact Number</span>
   <span style="color: red;" id="cnTxt"></span>
   </td>
</tr>
<tr>
   <td><label>Enter DOB:</label></td>
   <td>
   <input class="well well-sm" name="userDOB" ng-model="userDOB" ng-pattern="/^([0-9]{2})([/-])([0-9]{2})([/-])([0-9]{4})$/" required>
   <span style="color: red;" ng-show="user.userDOB.$error.pattern">/ and - are seperator </span>
   </td>
</tr>
<tr>
   <td></td>
   <td>
<input class="well well-sm"  type="submit" ng-disabled="user.userFirstName.$invalid||user.userLastName.$invalid||
user.userEmailId.$invalid||user.userContactNumber.$invalid||user.userDOB.$invalid">
   </td>
</tr>
</table>
</form>
</div>
<script>
var app=angular.module("myApps",[]);
app.controller("myCtrls",function($scope){

});
</script>
<script type="text/javascript">
//onchange ajax call
 function checkEmail(anchor) {
    $.ajax({  
        url : "./user/emailexistance",   
        method : "POST", 
        data: {userEmailId : anchor },    
        success : function(response) {  
           document.getElementById("eidTxt").innerHTML=response;   
         },  
         error : function(e) {  
          alert('Error: ' + e);   
         }  
    });
}
 function checkContactNumber(anchor) {
	    $.ajax({  
	        url : "./user/contactnumberexistence",   
	        method : "POST", 
	        data: {userContactNumber : anchor },    
	        success : function(response) {  
	           document.getElementById("cnTxt").innerHTML=response;   
	         },  
	         error : function(e) {  
	          alert('Error: ' + e);   
	         }  
	    });
	}
function validate(){
	var eidTxt=document.getElementById("eidTxt").innerHTML;
	var cnTxt=document.getElementById("cnTxt").innerHTML;
	if(eidTxt==""&&cnTxt=="") return true;
	return false;
}
</script>
</body>
</html>