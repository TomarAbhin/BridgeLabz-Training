package OceanFleet;

public class Vessel {
	private String vesselId;
	private String vesselName;
	private double averageSpeed;
	private String vesseltype;
	
	public Vessel() {}
	
	public Vessel(String vesselId, String vesselName, double averageSpeed, String vesseltype) {
		super();
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.averageSpeed = averageSpeed;
		this.vesseltype = vesseltype;
	}

	public String getVesselId() {
		return vesselId;
	}

	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public double getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public String getVesseltype() {
		return vesseltype;
	}

	public void setVesseltype(String vesseltype) {
		this.vesseltype = vesseltype;
	}
	
	
	

}
