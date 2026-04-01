package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)   //needed at runtime
@Target(ElementType.FIELD)            //applied to fields only
@interface JsonField {
    String name();                    //custom JSON key name
}

class Person {
    @JsonField(name = "user_name")
    private String username;
    @JsonField(name = "user_age")
    private int age;
    private String password; //not serialized
    public Person(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }
}

class JsonSerializer {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();
        boolean firstField = true;
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                try {
                    Object value = field.get(obj);
                    if (!firstField) {
                        json.append(", ");
                    }

                    json.append("\"")
                        .append(annotation.name())
                        .append("\": ");

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }
                    firstField = false;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}

public class CustomSerializationAnnotation {
    public static void main(String[] args) {
        Person p = new Person("Abhinav", 23, "ishdyf3107");
        String json = JsonSerializer.toJson(p);
        System.out.println(json);
    }
}

