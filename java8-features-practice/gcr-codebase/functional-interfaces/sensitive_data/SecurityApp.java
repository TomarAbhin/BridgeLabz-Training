package sensitive_data;

public class SecurityApp {

    public static void main(String[] args) {

        CustomerDetails customer = new CustomerDetails("Abhinav", "1234-5678-9012");
        ProductInfo product = new ProductInfo("Laptop");

        EncryptionService.encrypt(customer);
        EncryptionService.encrypt(product);
    }
}

