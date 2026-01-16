package reflections;

import java.lang.reflect.*;
//class with private static field
class Api {
 private static String API_KEY = "API-3107";
}

public class AccessAndModifyStaticFields {
 public static void main(String[] args) throws Exception {

     //get the Class object
     Class<?> cls = Api.class;

     //access private static field 
     Field field = cls.getDeclaredField("API_KEY");
     field.setAccessible(true); //allowing access to private static field
     //get the old value 
     System.out.println("Old API Key: " + field.get(null));
     //modify the static field value
     field.set(null, "API-0007");
     //get the modified value
     System.out.println("New API Key: " + field.get(null));
 }
}


