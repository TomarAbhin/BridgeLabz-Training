package robot-analyzer;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Arm Precision(0.0 - 1.0): ");
		double armPrecision=s.nextDouble();
		
		System.out.print("Enter Worker Density(1 - 20): ");
		int workerDensity=s.nextInt();
		
		System.out.print("Enter Machinery State(Worn/Faulty/Critical): ");
		String machineryState=s.next();
		
		try {
			double ans=RobotHazardAuditor.calculateHazardRisk(armPrecision,workerDensity,machineryState);
			System.out.println("\nRobot Hazard Risk Score: "+ans);
		}catch(RobotSafetyException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
