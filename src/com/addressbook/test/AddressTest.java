package com.addressbook.test;
import com.addressbook.model.Person;
import com.addressbook.model.AddressControll;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressTest
{
	Person person = new Person();
    	Scanner scan = new Scanner(System.in);
    	public void selectTask()
    	{
        	boolean value = true;
       		while(value)
        	{
            	try
            	{
                	System.out.println("\nSelect the task : \n1: Add details \n2: Display details " +"\n3: Edit details \n4: Delete details \n5: Sort by name or zipcode  \n6: Exit");
                	int num = scan.nextInt();
                	switch (num)
                	{
                    	case 1:
                        	person.addName();
                        	System.out.println("===============================================================");
                        break;
                    	case 2:
                        	person.display();
                       		System.out.println("===============================================================");
                        break;
                    	case 3:
                        	person.editOrDeleteDetails(0);
                        	System.out.println("===============================================================");
                        break;
                    	case 4:
                        	person.editOrDeleteDetails(1);
                        	System.out.println("===============================================================");
                        break;
                    	case 5:
                        	person.sortBy();
                        	System.out.println("===============================================================");
                        break;
                    	case 6:
                        	value=false;
                        break;
                   	default:
                        	System.out.println("Invalid Input");
                        System.out.println("===============================================================");
                	}
            	}
            	catch (InputMismatchException e)
            	{
                	System.out.println("Enter the valid required input.");
                	scan.next();
            	}

        	}
    	}

    	public static void main(String[] args)
    	{
        	System.out.println("<<<<<<<<<===================================>>>>>>\nWelcome to Address Book Program\n<<<<<<<<<<<<<<<=========================================>>>>>>>>>>>>>>>>>>");
        	AddressTest addressTest = new AddressTest();
        	addressTest.selectTask();
    	}
}
