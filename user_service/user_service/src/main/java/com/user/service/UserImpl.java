package com.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserImpl implements UserService{

	
	//fake user list 
	//List <User>list =(List<User>) new User(12,"swati","8527445943");
	//List <User>list =(List<User>) new User(12,"swati","8527445943");
	//List <User>list =(List<User>) new User(12,"swati","8527445943");
	private static List <User>list =new ArrayList<>();
		static
		{
			list.add(new User(12,"Swati","8527445943"));
			list.add(new User(13,"Shruti","9729917940"));
			list.add(new User(14,"Aarush","9896082988"));

	}
		
	
	
	@Override
	public User getUser(int id) {
	//	return this.list.stream().filter(user->user.getUserId().eq
		return UserImpl.list.stream().filter(user->user.getUserId()==id).findFirst().get();

	}

}
