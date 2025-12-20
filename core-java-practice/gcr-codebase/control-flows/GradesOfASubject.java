import java.util.*;
public class GradesOfASubject {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int physicsMarks=s.nextInt(); //input marks of physics
        int mathsMarks=s.nextInt(); //input marks of maths
        int chemistryMarks=s.nextInt(); //input marks of chemistry
        int totalMarks=physicsMarks+mathsMarks+chemistryMarks;
        double percentage=(totalMarks/300.0)*100.0;
        if(percentage>=80){
            System.out.println("If the average percentage is "+percentage+", then the grade is A and the remarks is above agency-normalized standards.");
        }else if(percentage>=70 && percentage<=79){
            System.out.println("If the average percentage is "+percentage+", then the grade is B and the remarks is at agency-normalized standards.");
        }else if(percentage>=60 && percentage<=69){
            System.out.println("If the average percentage is "+percentage+", then the grade is C and the remarks is needs improvement to meet agency-normalized standards.");
        }else if(percentage>=50 && percentage<=59){
            System.out.println("If the average percentage is "+percentage+", then the grade is D and the remarks is below agency-normalized standards.");
        }else if(percentage>=40 && percentage<=49){
            System.out.println("If the average percentage is "+percentage+", then the grade is E and the remarks is poor performance.");
        }else{
            System.out.println("If the average percentage is "+percentage+", then the grade is R and the remarks is remedial standards.");
        }
    }
}
