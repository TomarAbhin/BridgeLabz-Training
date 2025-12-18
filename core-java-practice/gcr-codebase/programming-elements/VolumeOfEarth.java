public class VolumeOfEarth {
    public static void main(String[] args) {
        double rad = 6378; // radius of the Earth in kilometers
        double miles=rad*0.621371; // radius of earth in miles
        double pi=3.14; // value of pi
        double volumeinkm = (4/3)*pi*rad*rad*rad; // calculate volume using the formula of volume of sphere in kilomters
        double volumeinmiles = (4/3)*pi*miles*miles*miles; // calculate volume in miles
        System.out.println("The volume of the Earth in km is: "+volumeinkm+" and in miles is: "+volumeinmiles);
    }
    
}
