package com.addressbook.model;
import java.util.*;
import java.io.*;
public class Person implements Comparable<Person>,Serializable{
	static String address;
	static String name;
	static String email;
	static String mobile;
	static String state;
	static String city;
	static double zip;
	Person(){}
	Person(String address, String name, String city , String state, String email, String mobile , double zip){
		this.address=address;
		this.name=name;
		this.email=email;
		this.mobile=mobile;
		this.state=state;
		this.city=city;
		this.zip=zip;
	}

	public void setAddress(){
		this.address = address;
	}

	public void setName(String name){
		this.name=name;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setState(String state){
		this.state=state;
	}

	public void setemail(String email){
                this.email=email;
        }
	public void setmobile(String mobile){
                this.mobile=mobile;
        }

	public void setzip(double zip){
		this.zip=zip;
	}


	public String getAddress(){
		return this.address;
	}

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}
	public String getCity(){
		return this.city;
	}

	public String getState(){
		return this.state;
	}
	public String getmobile(){
		return this.mobile;
	}
	public double getzip(){
		return this.zip;
	}
	
	public String toString(){
		return this.address +"\n" +this.city + "\n" +this.name +"\n" +this.email + "\n" +this.zip;
	}

	public int compareTo(Person person){
		if(this.address.getzip() > person.address.getzip()){
			return 1;
		}
		if(this.address.getzip() < person.address.getzip()){
			return -1;
		}
		return 0;
	}

}
