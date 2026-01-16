package reflections;

import java.lang.reflect.*;
import java.util.*;

//class with multiple methods
class MathOperations {
	//method for addition
    public int add(int a, int b) {  
        return a + b;
    }
    //method for substraction
    public int subtract(int a, int b) {
        return a - b;
    }
    //method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        //create the object
        MathOperations math = new MathOperations();
        //get Class object
        Class<?> cls = math.getClass();

        //take the method name from user
        System.out.print("enter method name (add/ subtract/ multiply): ");
        String methodName = s.nextLine();

        //take numbers from user
        System.out.print("enter first number: ");
        int a = s.nextInt();

        System.out.print("enter second number: ");
        int b = s.nextInt();

        //get the method dynamically
        Method m = cls.getMethod(methodName, int.class, int.class);

        //invoke the method dynamically
        Object ans = m.invoke(math, a, b);

        System.out.println("Result: " + ans);

    }
}


