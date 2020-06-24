package com.addressbook.model;
public class Person{
	String name;
	String email;
	double mobile;
	
	public void setName(String name){
		this.name=name;
	}
	public void setemail(String email){
                this.email=email;
        }
	public void setmobile(double mobile){
                this.mobile=mobile;
        }

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}
	public double getmobile(){
		return this.mobile;
	}

}
