package addressbook;

import java.util.*;

public class Book {
	private List<Address> person=new ArrayList<>();
	
	public void addDetail(Address address) {
		person.add(address);
	}
	public boolean editDetails(String name,Scanner s) {
		for(Address ad:person) {
			if(ad.getFirstName().equalsIgnoreCase(name)) {
			

		         System.out.print("Enter New Last Name: ");
		         ad.setLastName(s.nextLine());

		         System.out.print("Enter New Phone Number: ");
		         ad.setPhoneNumber(s.nextLine());

		         System.out.print("Enter New Email: ");
		         ad.setEmail(s.nextLine());

		         System.out.print("Enter New Address: ");
		         ad.setAddress(s.nextLine());

		         System.out.print("Enter New City: ");
		         ad.setCity(s.nextLine());

		         System.out.print("Enter New State: ");
		         ad.setState(s.nextLine());

		         System.out.print("Enter New Zip Code: ");
		         ad.setZip(s.nextLine());
		         
		         return true;
			}
		}
		return false;
	}
	
	public void displayDetails() {
		for(Address address:person) {
			System.out.println(address);
		}
	}

}
