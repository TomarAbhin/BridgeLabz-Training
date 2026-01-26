package addressbook;

import java.util.*;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Book addressBook=new Book();
		
		System.out.print("Enter First Name: ");
		String firstName=s.nextLine();
		
		System.out.print("Enter Last Name: ");
		String lastName=s.nextLine();
		
		System.out.print("Enter Phone Number: ");
		String phoneNumber=s.nextLine();
		
		System.out.print("Enter Email: ");
		String email=s.nextLine();
		
		System.out.print("Enter Address: ");
		String address=s.nextLine();
		
		System.out.print("Enter City: ");
		String city=s.nextLine();
		
		System.out.print("Enter State: ");
		String state=s.nextLine();
		
		System.out.print("Enter Zip Code: ");
		String zip=s.nextLine();
		
		Address person=new Address(firstName,lastName,phoneNumber,email,address,city,state,zip);
		addressBook.addDetail(person);
		
		System.out.println("\nContact Added Successfully\n");
		addressBook.displayDetails();
		
	}
}
