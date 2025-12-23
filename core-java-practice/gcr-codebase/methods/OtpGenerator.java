public class OtpGenerator {
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        // Generate 10 OTP numbers
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.print("Generated OTPs: ");
        for (int otp : otpArray) {
            System.out.print(otp + " ");
        }
        System.out.println();

        // Checking whether all OTPs are unique
        boolean isUnique = checkUniqueOTPs(otpArray);

        if (isUnique) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Generates random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check uniqueness of OTPs
    public static boolean checkUniqueOTPs(int[] otps) {

        // Compare each OTP with every other OTP
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All OTPs are unique
    }
}


