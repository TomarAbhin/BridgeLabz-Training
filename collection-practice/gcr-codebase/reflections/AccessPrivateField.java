package reflections;

import java.lang.reflect.*;

//class with private field age
class Person {
 private int age;
}


public class AccessPrivateField {
 public static void main(String[] args) throws Exception {

     //create object of Person
     Person p = new Person();

     //get Class object
     Class<?> cls = p.getClass();

     //access private field "age"
     Field field = cls.getDeclaredField("age");
     field.setAccessible(true); //alllowing access to private field

     //set field value
     field.set(p, 22);

     //get the field value
     System.out.println("Age: " + field.get(p));
 }
}

