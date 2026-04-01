package logistics;

public class TimberTransport extends GoodsTransport {
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	
	public TimberTransport(String transportId,String transportDate,int transportRating,float timberLength,float timberRadius,String timberType,float timberPrice) {
		super(transportId,transportDate,transportRating);
		this.timberLength=timberLength;
		this.timberRadius=timberRadius;
		this.timberType=timberType;
		this.timberPrice=timberPrice;
	}

	

	public float getTimberLength() {
		return timberLength;
	}

	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}

	public float getTimberRadius() {
		return timberRadius;
	}

	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}

	public String getTimberType() {
		return timberType;
	}

	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}

	public float getTimberPrice() {
		return timberPrice;
	}

	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	public String vehicleSelection() {
		float area=2f*3.147f*timberRadius*timberLength;
		
		if(area<250) {
			return "Truck";
		}else if(area>=250 && area<=400) {
			return "Lorry";
		}else {
			return "MonsterLorry";
		}
	}
	public float calculateTotalCharge() {
		float volume=3.147f*timberRadius*timberRadius*timberLength;
		float price;
		if(timberType.equalsIgnoreCase("Premium")) {
			price=timberPrice*volume*0.25f;
		}else {
			price=timberPrice*volume*0.15f;
		}
		float cost=timberPrice*volume;
		float costAfterTax=cost+(cost*0.30f);
		String vehicle=vehicleSelection();
		float vehiclePrice=0.0f;
		if(vehicle.equalsIgnoreCase("Truck")) {
			vehiclePrice=1000f;
		}else if(vehicle.equalsIgnoreCase("Lorry")) {
			vehiclePrice=1700f;
		}else {
			vehiclePrice=3000f;
		}
		float discount=getDiscount(cost);
		return costAfterTax+vehiclePrice-discount;
	}
	
	public float getDiscount(float cost) {
		if(transportRating==5) {
			return cost*0.20f;
		}else if(transportRating==3 || transportRating==4) {
			return cost*0.10f;
		}else {
			return cost;	
		}
	}
}

