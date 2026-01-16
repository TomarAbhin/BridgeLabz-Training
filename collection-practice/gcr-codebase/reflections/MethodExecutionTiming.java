package reflections;

import java.lang.reflect.*;

//class with methods of which time is to be checked
class Task {
	public void fastTask() {   //small task
		for (int i=0;i<1000;i++) {
		}
	}

	public void slowTask() {   //heavy task
		for (int i=0;i<1000000;i++) {   
		}
	}
}

public class MethodExecutionTiming {
 public static void main(String[] args) throws Exception {

     //create a object
     Task processor = new Task();
     //get Class object
     Class<?> cls = processor.getClass();
     //get all the declared methods
     Method[] methods = cls.getDeclaredMethods();
     //measure execution time for each method
     for (Method m : methods) {
         //start time
         long startTime = System.nanoTime();
         
         //invoke method dynamically
         m.invoke(processor);

         //end time
         long endTime = System.nanoTime();
         //calculate execution time
         long totalTime = endTime-startTime;

         System.out.println("Method: " + m.getName() +" | Execution Time: " + totalTime + " ns");
     	}
 	}
}



