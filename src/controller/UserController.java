package controller;

import model.User;
public class UserController {
	
	public boolean checkAuthenticUser(String userName,String password){
		User user = new User();
		if(user.isAuthentictUser(userName,password))return true;
		else return false;
	}
}
