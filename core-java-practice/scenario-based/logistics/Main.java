package logistics;

import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the details: ");
		String input=s.nextLine();
		
		GoodsTransport gt=Utility.createTransport(input);
		
		if (gt instanceof BrickTransport) {
		    BrickTransport bt = (BrickTransport) gt;

		    System.out.println("\nTransporter id : " + bt.getTransportId());
		    System.out.println("Date of transport : " + bt.getTransportDate());
		    System.out.println("Rating of the transport : " + bt.getTransportRating());
		    System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
		    System.out.println("Brick price : " + bt.getBrickPrice());
		    System.out.println("Vehicle for transport : " + bt.vehicleSelection());
		    System.out.println("Total charge : " + bt.calculateTotalCharge());
		}
		
		s.close();
	}


}
