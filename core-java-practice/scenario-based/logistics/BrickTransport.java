package logistics;

public class BrickTransport extends GoodsTransport{
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(String transportId,String transportDate,int transportRating,float brickSize,int brickQuantity,float brickPrice) {
		super(transportId,transportDate,transportRating);
		this.brickSize=brickSize;
		this.brickQuantity=brickQuantity;
		this.brickPrice=brickPrice;
	}

	public float getBrickSize() {
		return brickSize;
	}

	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}

	public int getBrickQuantity() {
		return brickQuantity;
	}

	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}

	public float getBrickPrice() {
		return brickPrice;
	}

	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	public String vehicleSelection() {
		if(brickQuantity<300) {
			return "Truck";
		}else if(brickQuantity>=300 && brickQuantity<=500) {
			return "Lorry";
		}else {
			return "Monster Lorry";
		}
	}
	public float calculateTotalCharge() {
		float cost=brickQuantity*brickPrice;
		float costAfterTax=cost+(cost*.30f);
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
