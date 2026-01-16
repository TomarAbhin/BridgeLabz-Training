package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)   //needed at runtime
@Target(ElementType.TYPE)             //applied at class level
@interface RoleAllowed {
    String value();                   //allowed role
}

class SecurityContext {
    static String currentUserRole;
}
@RoleAllowed("ADMIN")
class AdminService {
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }
}

class AccessManager {
    public static void invokeMethod(Object obj, String methodName) {
        Class<?> cls = obj.getClass();

        //check class-level roleallowed annotation
        if (cls.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = cls.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();
            if (!requiredRole.equals(SecurityContext.currentUserRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }

        //invoke method if access is allowed
        try {
            Method method = cls.getDeclaredMethod(methodName);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class RoleBasedControl {
    public static void main(String[] args) {
        AdminService service = new AdminService();

        //case 1:USER role
        SecurityContext.currentUserRole = "USER";
        System.out.println("Current Role: USER");
        AccessManager.invokeMethod(service, "deleteUser");

        //case 2:ADMIN role
        SecurityContext.currentUserRole = "ADMIN";
        System.out.println("\nCurrent Role: ADMIN");
        AccessManager.invokeMethod(service, "deleteUser");
    }
}

