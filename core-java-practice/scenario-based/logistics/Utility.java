package logistics;

public class Utility {
	public static GoodsTransport createTransport(String data) {

	    String[] values = data.split(":");

	    String transportId = values[0];
	    if(!validateTransportId(transportId)) {
	    	return null;
	    }
	    String transportDate = values[1];
	    int transportRating = Integer.parseInt(values[2]);

	    String transportType = values[3];

	    if (transportType.equalsIgnoreCase("TimberTransport")) {

	        float timberLength = Float.parseFloat(values[4]);
	        float timberRadius = Float.parseFloat(values[5]);
	        String timberType = values[6];
	        float timberPrice = Float.parseFloat(values[7]);

	        return new TimberTransport(
	                transportId,
	                transportDate,
	                transportRating,
	                timberLength,
	                timberRadius,
	                timberType,
	                timberPrice);
	    }else if(transportType.equalsIgnoreCase("Bricktransport")) {
	    	float brickSize=Float.parseFloat(values[4]);
	    	int brickQuantity=Integer.parseInt(values[5]);
	    	float brickPrice=Float.parseFloat(values[6]);
	    	
	    	return new BrickTransport( transportId, transportDate, transportRating, brickSize, brickQuantity, brickPrice);
	    }

	    return null;
	}
	public static boolean validateTransportId(String transportId) {

	    if (transportId != null && transportId.matches("^RTS[0-9]{3}[A-Z]$")) {
	        return true;
	    }

	    System.out.println("Transport Id " + transportId + " is invalid");
	    return false;
	}

    public static String findObjectType(GoodsTransport goodsTransport) {

        if (goodsTransport instanceof TimberTransport) {
            return "TimberTransport";
        } else if (goodsTransport instanceof BrickTransport) {
            return "BrickTransport";
        }
        return "Unknown Transport";
    }


}
