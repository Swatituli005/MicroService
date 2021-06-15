package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	private static List <Contact>list =new ArrayList<>();
	static
	{
		list.add(new Contact(1l,"Swati@gmail.com","8527445943",12));
		list.add(new Contact(2l,"Shruti@gmail.com","9729917940",12));
		list.add(new Contact(3l,"Aarush@gmail.com","9896082988",14));

}
	
	@Override
	public List<Contact> getContactsOfUser(int userId) {
		return list.stream().filter(Contact->Contact.getUserId()==(userId)).collect(Collectors.toList());
		//return (List<Contact>) ContactServiceImpl.list.stream().filter(Contact->Contact.getUserId()==id).findFirst().get();

	}

}
