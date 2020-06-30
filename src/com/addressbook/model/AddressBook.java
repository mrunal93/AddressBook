package com.addressbook.test;
import com.addressbook.model.Person;
public class Addressbook{

	public static void main(String[] arg){
		Person newperson=new Person();
		newperson.setName("Mrunal");
		newperson.setemail("mrn26893@gmail.com");
		newperson.setmobile(9326);
		newperson.setzipcode(400614);
		System.out.println("Person name:" +newperson.getName());
		System.out.println("Person Email:"+newperson.getEmail());
		System.out.println("Person mobil:"+newperson.getmobile());
		System.out.println("Person zip:"+newperson.getzip());

	}
}
