package robot-analyzer;

public class RobotHazardAuditor {
	
	public static double calculateHazardRisk(double armPrecision,int workerDensity,String machineryState) throws RobotSafetyException{
		double hazardRisk;
		double riskFactor=0.0;
		
		switch(machineryState) {
			case "Worn": riskFactor=1.3;
							break;
			case "Faulty": riskFactor=2.0;
							break;
			case "Critical": riskFactor=3.0;
								break;
		}
		
		
		if(armPrecision<0.0 || armPrecision >1.0) {
			throw new RobotSafetyException("Error: Arm Precision must be in range 0.0 and 1.0.");
		}else {
			hazardRisk=((1.0-armPrecision)*15.0)+(workerDensity*riskFactor);
		}
		
		if(workerDensity<1 || workerDensity>20) {
			throw new RobotSafetyException("Error: Worker Density must be 1-20.");
		}else {
			hazardRisk=((1.0-armPrecision)*15.0)+(workerDensity*riskFactor);
		}
		
		if(!(machineryState.equals("Worn") || machineryState.equals("Faulty") || machineryState.equals("Critical"))) {
			throw new RobotSafetyException("Error: Unsupported machinery state.");
		}else {
			hazardRisk=((1.0-armPrecision)*15.0)+(workerDensity*riskFactor);
		}
		
		return hazardRisk;
	}

}
