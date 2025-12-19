import java.util.*;
public class YoungestOfThreeFriends {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ageOfAkbar=s.nextInt(); // input age of Akbar
        int ageofAmar=s.nextInt(); // input age of Amar
        int ageOfAnthony=s.nextInt(); // input age of Anthony

        if(ageOfAkbar<ageofAmar && ageOfAkbar<ageOfAnthony){ // check if Akbar is youngest
            System.out.println("youngest is akbar with age: " + ageOfAkbar); 
        }
        else if(ageofAmar<ageOfAkbar && ageofAmar<ageOfAnthony){ // check if Amar is youngest
            System.out.println("youngest is amar with age: " + ageofAmar);
        }
        else{ // if Anthony is youngest
            System.out.println("youngest is anthony with age: " + ageOfAnthony);
        }  

        int heightOfAkbar=s.nextInt(); // input height of Akbar
        int heightOfAmar=s.nextInt(); // input height of Amar
        int heightOfAnthony=s.nextInt(); // input height of Anthony
        
        
        if(heightOfAkbar>heightOfAmar && heightOfAkbar>heightOfAnthony){ // check if Akbar is tallest
            System.out.println("tallest is akbar with height: " + heightOfAkbar); 
        }
        else if(heightOfAmar>heightOfAkbar && heightOfAmar>heightOfAnthony){ // check if Amar is tallest
            System.out.println("tallest is amar with height: " + heightOfAmar);
        }
        else{ // if Anthony is tallest
            System.out.println("tallest is anthony with height: " + heightOfAnthony);
        }
    }
}
