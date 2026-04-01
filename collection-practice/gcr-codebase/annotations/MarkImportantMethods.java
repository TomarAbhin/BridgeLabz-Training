package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)   //available at runtime
@Target(ElementType.METHOD)            //applicable to methods only
@interface ImportantMethod {
    String level() default "HIGH";     //optional parameter
}

class Bank {

    @ImportantMethod
    public void processPayment() {
        System.out.println("Processing payment:");
    }

    @ImportantMethod(level = "MEDIUM")
    public void generateInvoice() {
        System.out.println("Generating invoice:");
    }

    public void normalMethod() {
        System.out.println("Normal method");
    }
}

public class MarkImportantMethods {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Class<?> cls = bank.getClass();

        for (Method method:cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);

                System.out.println("Important Method: " + method.getName() +" And Level: " + annotation.level());
            }
        }
    }
}
