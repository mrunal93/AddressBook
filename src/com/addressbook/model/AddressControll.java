package com.addressbook.model;
//import com.addressbook.model.Person;

public interface AddressControll {

	void addName();
	void addDetails(Person addressBook);
	void editOrDeleteDetails(int select);
	void display();
	void sortBy();

}
