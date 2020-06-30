package com.addressbook.model;
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
public class Person implements Serializable
{

	static String name;
    	static String email;
    	static String address;
    	static String city;
    	static String state;
    	static String zipCode;
    	static String phoneNumber;
    	Scanner scan = new Scanner(System.in);
    	List<Person> addressBookList = new ArrayList<>();

    public void addName()
    {
        Person addressBook = new Person();
        System.out.println("Enter your Name");
        addressBook.name = scan.next();
        System.out.println("Enter your Email Address");
        addressBook.email = scan.next();
        addDetails(addressBook);
        addressBookList.add(addressBook);
        addressBookList = addressBookList.stream().distinct().collect(Collectors.toList());
    }

    public void addDetails(Person addressBook)
    {
        scan.nextLine();
        System.out.println("Enter your Address");
        addressBook.address = scan.nextLine();
        System.out.println("Enter your City");
        addressBook.city = scan.nextLine();
        System.out.println("Enter your State");
        addressBook.state = scan.nextLine();
        System.out.println("Enter your Zip code");
        addressBook.zipCode = scan.next();
        //To Check the 6 digit Zipcode
        //while(addressBook.zipCode.length() != 6)
        //{
          //  System.out.println("enter 6 digit number");
            //addressBook.zipCode = scan.next();
            //if(addressBook.zipCode.length() == 6)
            //{
              //  break;
            //}
        //}
        System.out.println("Enter your Phone Number");
        addressBook.phoneNumber = scan.next();
    }

    public String toString()
    {
        return "NAME: "+name+" "+"EMAIL: "+email+"  "+"ADDRESS: "+address+"  "+"CITY: "+
                city+"  "+"STATE: "+state+"  "+"ZIPCODE: "+zipCode+"  "+"PHONE NO.: "+phoneNumber;
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        	if (o == null || getClass() != o.getClass()) return false;
        	Person that = (Person) o;
        	return name.equals(that.name) && email.equals(that.email) ;
    }

    public int hashCode()
    {
        return Objects.hash(name, email);
    }

    public void editOrDeleteDetails(int select)
    {
        boolean check = true;
        System.out.println("Enter your Name");
        String name = scan.next();
        System.out.println("Enter your Email Address");
        String email = scan.next();
        //To select whether to Edit or Delete the record
        int record = 0;
        for ( Person details : addressBookList){
    		if( details.name.equals(name) ){
                	if(details.email.equals(email)){
                    check = false;
                    switch (select)
                    {
                        case 0:
                            addDetails(details);
                            break;
                        case 1:
                            addressBookList.remove(record);
                            break;
                    }
                }
            }
            record++;
        }
        if (check == true)
        {
            System.out.println("Record does not exist");
        }
    }

    public void display()
    {
        boolean check = true;
        System.out.println("Enter City Name or State Name");
        String place = scan.next();
        System.out.println("ADDRESS BOOK DETAILS : ");
        System.out.println("--------------------------------------------------------------------------------");
        for ( Person details : addressBookList){
            if(( details.city.equals(place)) || (details.state.equals(place))){
                check = false;
                System.out.println(details);
            }
        }
        if (check == true)
        {
            System.out.println("Record does not exist");
        }
    }

    public void sortBy()
    {
        System.out.println("Select the type of sorting you want to do. \n1: Sort by name \n2: Sort by ZipCode" +
                " \n3: Sort by City \n4: Sort by State");
        int select = scan.nextInt();
        switch (select)
        {
            case 1:
                addressBookList.sort(Comparator.comparing(Person::hashCode));
                break;
            case 2:
                addressBookList.sort(((Comparator<Person>)
                        (bookDetails1, bookDetails2) -> bookDetails2.zipCode.compareTo(bookDetails1.zipCode))
                        .reversed());
                break;
            case 3:
                addressBookList.sort(((Comparator<Person>)
                        (bookDetails1, bookDetails2) -> bookDetails2.city.compareTo(bookDetails1.city)).reversed());
                break;
            case 4:
                addressBookList.sort(((Comparator<Person>)
                        (bookDetails1, bookDetails2) -> bookDetails2.state.compareTo(bookDetails1.state)).reversed());
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("ADDRESS BOOK DETAILS : ");
        System.out.println("-----------------------------------------------------------------------------");
        addressBookList.forEach(System.out::println);
    }
}

