package com.addressbook.test;
import com.addressbook.model.Person;
public class Addressbook{

	public static void main(String[] arg){
		Person newperson=new Person();
		newperson.setName("Mrunal");
		newperson.setemail("mrn26893@gmail.com");
		newperson.setmobile(9326);
		System.out.println("Person name:" +newperson.getName());
		System.out.println("Person Email:"+newperson.getEmail());
	}
}
