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

<h3 style="color:green" align="center">Welcome to User Please Login</h3><br>

<form name="myForm" action="./user/login" method="post">

<table>

<tr>
   <td>
      Enter EmailID or Mobile Number:
   </td>
  <td>
    <input type="text" name="email" ng-model="email" ng-pattern="/^[A-z0-9!@#$*.]{10,35}$/" class="well well-sm" required>
    <span ng-show="myForm.email.$error.pattern" style="color:red">Invalid EmailId or Mobile Number</span>
  </td>
</tr>

<tr>
   <td>
      Enter Password:
   </td>
   <td>
      <input name="password" type="password" required ng-pattern="/^[A-z0-9!@#$*_.]{4,16}$/" class="well well-sm" ng-model="password">
      <span ng-show="myForm.password.$error.pattern" style="color:red">Password Should have min 4 max 6 chars</span>
   </td>
</tr>

<tr>
  <td>
  </td>
  <td>
     <input type="submit" class="btn btn-primary btn-sm btn-block" value="Login" ng-disabled="myForm.email.$untouched||myForm.email.$dirty&&myForm.email.$invalid&&myForm.password.$dirty||myForm.password.$invalid||myForm.email.$invalid">
  </td>
</tr>
</table>
</form>
</div>
<script>
var app=angular.module("myApps",[]);
app.controller("myCtrls",function($scope){

});
//onchange ajax call
/* function organizationData(anchor) {
    var value = anchor.getAttribute('value');  
    $.ajax({  
        url : "manageOrganization",   
        method : "GET",   
        dataType: "json",
        contentType: 'application/json',
        data: {organizationId : value },    
        success : function(response) {  
            alert(response);   
         },  
         error : function(e) {  
          alert('Error: ' + e);   
         }  
    });
}
 */
</script>
</body>
</html>