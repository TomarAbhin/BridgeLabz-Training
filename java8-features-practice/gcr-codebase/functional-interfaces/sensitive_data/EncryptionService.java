package sensitive_data;

public class EncryptionService {

    public static void encrypt(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj);
        } else {
            System.out.println("No encryption required");
        }
    }
}

