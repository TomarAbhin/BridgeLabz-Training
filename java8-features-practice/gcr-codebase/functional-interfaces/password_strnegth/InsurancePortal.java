package password_strnegth;

public class InsurancePortal {

    public static void main(String[] args) {

        String password1 = "Admin@123";
        String password2 = "admin123";

        System.out.println(SecurityUtils.isStrongPassword(password1));
        System.out.println(SecurityUtils.isStrongPassword(password2));
    }
}

