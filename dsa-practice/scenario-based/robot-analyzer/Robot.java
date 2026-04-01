package robot-analyzer;

public class Robot {
	private double armPrecision;
	private int workerDensity;
	private String machineryState;
	
	public Robot(double armPrecision, int workerDensity, String machineryState) {
		super();
		this.armPrecision = armPrecision;
		this.workerDensity = workerDensity;
		this.machineryState = machineryState;
	}
	
	public double getArmPrecision() {
		return armPrecision;
	}
	public void setArmPrecision(double armPrecision) {
		this.armPrecision = armPrecision;
	}
	public int getWorkerDensity() {
		return workerDensity;
	}
	public void setWorkerDensity(int workerDensity) {
		this.workerDensity = workerDensity;
	}
	public String getMachineryState() {
		return machineryState;
	}
	public void setMachineryState(String machineryState) {
		this.machineryState = machineryState;
	}
	
}
