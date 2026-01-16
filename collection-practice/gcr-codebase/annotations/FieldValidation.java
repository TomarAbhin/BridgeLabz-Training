package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)     //needed for reflection
@Target(ElementType.FIELD)              //can be applied only to fields
@interface MaxLength {
    int value();                        //maximum allowed length
}

class User {
    @MaxLength(10)
    private String name;
    public User(String name) {
        //validate using reflection
        try {
            Field field = this.getClass().getDeclaredField("name");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (name.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username length exceeds maximum limit of "+ maxLength.value());
                }
            }
            this.name = name;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        System.out.println("Username: " +name);
    }
}

public class FieldValidation {
    public static void main(String[] args) {
        //valid case
        User user1 = new User("Abhinav");
        user1.display();

        //invalid case
        User user2 = new User("ABhinav Tomar"); // Exception
        user2.display();
    }
}

