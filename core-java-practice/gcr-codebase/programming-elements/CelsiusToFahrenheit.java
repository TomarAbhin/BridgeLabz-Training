import java.util.*;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    double celsiustemp=s.nextInt(); //input in celsius
    double fahrenheittemp=(celsiustemp*9/5)+32; //conversion formula
    System.out.println("The temperature is: "+fahrenheittemp);
    }
}