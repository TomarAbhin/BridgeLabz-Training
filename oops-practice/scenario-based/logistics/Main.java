package logistics;

import java.util.*;

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
		}else if(gt instanceof TimberTransport) {
			TimberTransport tt=(TimberTransport) gt;
			 System.out.println("\nTransporter id : " + tt.getTransportId());
			    System.out.println("Date of transport : " + tt.getTransportDate());
			    System.out.println("Rating of the transport : " + tt.getTransportRating());
			    System.out.println("Timber Length: " + tt.getTimberLength());
			    System.out.println("Timber Radius : " + tt.getTimberRadius());
			    System.out.println("Timber Type : " + tt.getTimberType());
			    System.out.println("Timber price : " + tt.getTimberPrice());
			    System.out.println("Vehicle for transport : " + tt.vehicleSelection());
			    System.out.println("Total charge : " + tt.calculateTotalCharge());
			
		}
	}

}
