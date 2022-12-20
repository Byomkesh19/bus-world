package com.deewana.busworld.BO;

import com.deewana.busworld.dao.UserDAO;
import com.deewana.busworld.model.User;

public class UserBO {
	private UserDAO userDAO=new UserDAO();
	
	public boolean validateUser(int userId,String expectedPassword){
		
		//Fetched the actual password from the db;
		String actualPassword=userDAO.getActualPassword(userId);
		
		//comparing the user details
		if(expectedPassword.equals(actualPassword)){
			return true;
		}
		else{
			return false;
		}
	}

	public int registerUserBO(User user) {
		
		//After registration of user to the DB it returns the auto generated unique id
		int userId=userDAO.register(user);
		return userId;
	}

	public User getUserDetails(int userId) {
		User user=userDAO.getUser(userId);
		return user;
	}
}
