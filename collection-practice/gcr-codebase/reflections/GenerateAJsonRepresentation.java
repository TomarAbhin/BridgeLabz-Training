package reflections;

import java.lang.reflect.*;

//class 
class Student {
 private int rollNo = 1;
 private String name = "Abhinav";	
 private boolean active = true;
}

public class GenerateAJsonRepresentation {
 public static void main(String[] args) throws Exception {

     //create a object
     Student s = new Student();

     //get class object
     Class<?> cls = s.getClass();
     //get all the fields
     Field[] fields = cls.getDeclaredFields();

     //start JSON-like string
     StringBuilder json = new StringBuilder();
     json.append("{");
     for (int i = 0; i < fields.length; i++) {
         Field f = fields[i];
         f.setAccessible(true); //access private fields
         //append field name
         json.append("\"").append(f.getName()).append("\": ");

         Object value = f.get(s);
         //add quotes for string values
         if (value instanceof String) {
             json.append("\"").append(value).append("\"");
         } else {
             json.append(value);
         }
         if (i < fields.length - 1) {
             json.append(", ");
         }
     }

     //end JSON-like string
     json.append("}");
     System.out.println(json.toString());
 }
}


