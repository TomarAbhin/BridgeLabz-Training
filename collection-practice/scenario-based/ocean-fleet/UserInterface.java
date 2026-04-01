package OceanFleet;

import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		VesselUtil util=new VesselUtil();
		
		
		System.out.println("Enter the number of vessels to be added.");
		int n=Integer.parseInt(s.nextLine());
		
		System.out.println("Enter vessel details: ");
		for(int i=0;i<n;i++) {
			
			String input=s.nextLine();
			String []values=input.split(":");
			
			String vesselId=values[0];
			String vesselName=values[1];
			double averageSpeed=Double.parseDouble(values[2]);
			String vesselType=values[3];
			
			util.addVesselPerformance(new Vessel(vesselId,vesselName,averageSpeed,vesselType));

			
		}
		System.out.println("Enter the vessel id to check speed: ");
		String id=s.next();
		
		Vessel v=util.getVesselById(id);
		
		if(v!=null) {
			System.out.println(v.getVesselId()+" | "+v.getVesselName()+" | "+v.getVesseltype()+" | "+v.getAverageSpeed()+" knots ");
		}else {
			System.out.println("Vessel with id: "+id+" is not found.");
		}
		
		System.out.println("High Performance vessels are: ");
		
		List<Vessel> v1=util.getHighPerformanceVessels();
		 for (Vessel hv : v1) {
	            System.out.println(hv.getVesselId() + " | " +hv.getVesselName() + " | " +hv.getVesseltype() + " | " +hv.getAverageSpeed() + " knots");
	        }

	}
}
