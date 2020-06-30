package com.addressbook.controller;
import com.addressbook.model.Person;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class AddressControll {

	List<Person> personList = new ArrayList<Person>();
	Scanner sc = new Scanner(System.in);

	public AddressControll(String addressBookName)
	{
		this.addressBookName=addressBookName;
	}
	public List<Person> getPersonList()
	{
		return this.personList;
	}
	public void addPerson(Person newPer)
	{
		if(newPer==null){
			newPer=new Person();
			newPer.setAddress(new Address());

			System.out.print("Person Name: ");
			newPer.setName(sc.next());

			System.out.print("Person Email: ");
                        newPer.setemail(sc.next());

			System.out.print("Person Address");
                        newPer.getAddress().setAddress(sc.next());

			System.out.print("Person City:");
                        newPer.getAddress().setCity(sc.next());

			System.out.print("Person State");
                        newPer.getAddress().setState(sc.next());

			System.out.print("Person Mobile number: ");
                        newPer.setmobile(sc.next());

			System.out.print("Person ZipCode: ");
                        newPer.setzipcode(sc.next());
			}
			this.perList.add(newPer);

	public void editPerson(Person editPer){

		System.out.println("Enter the first name of person to edit: ");
		String fName = sc.next();
		editPer = this.getPersonFromList(fName);
		if(editPer !=null){

		System.out.print("Person Address:");
                editPer.getAddress().setAddress(sc.next());

		 System.out.print("Person City:");
                 editPer.getAddress().setCity(sc.next());

		System.out.print("Person State:");
                editPer.getAddress().setState(sc.next());

		System.out.print("Person Zip Code:");
                editPer.setzipCode(sc.next());

		System.out.print("Person Mobile Number:");
                editPer.setCity(sc.next());
		return;
		}




	}

	public void sortByName(){
		this.personList.sort(Comparator.comparing(e -> e.getName().toLowerCase()))

	}

	public void sortByZipCode(){
	Collection.sort(this.personList);
	}

	public Person getPersonFromList(String namee){
		for(Person per : this.personList){
			if(name.equalsIgnoreCase(per.getName())){
				return per;
			}
		}
		return null;
	}
	public void printAddressBookList(){
		System.out.println("-------------------------------------------------------------------------");
		for(Person per : this.personList)
		{
			System.out.println(per.toString());
		}
		return;
	}
}


}
