public class StringConcatenationPerformance {
    public static void main(String[] args) {
        int[] operations = {1000, 10000, 1_000_000};
        for (int n : operations) {
            System.out.println("operations count: " + n);

            //using string (O(N^2))
            long startString = System.nanoTime();
            concatenateUsingString(n);
            long endString = System.nanoTime();
            //using stringBuilder (O(N))
            long startBuilder = System.nanoTime();
            concatenateUsingStringBuilder(n);
            long endBuilder = System.nanoTime();

            //using stringBuffer (O(N))
            long startBuffer = System.nanoTime();
            concatenateUsingStringBuffer(n);
            long endBuffer = System.nanoTime();

            //convert time to milliseconds
            double stringTime = (endString - startString)/1_000_000.0;
            double builderTime = (endBuilder - startBuilder)/1_000_000.0;
            double bufferTime = (endBuffer - startBuffer)/1_000_000.0;

            System.out.println("String Time (O(N^2)): " + stringTime + " ms");
            System.out.println("StringBuilder Time (O(N)): " + builderTime + " ms");
            System.out.println("StringBuffer Time (O(N)): " + bufferTime + " ms");
        }
    }

    //string concatenation 
    public static String concatenateUsingString(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + "a";
        }
        return result;
    }

    //stringbuilder concatenation 
    public static String concatenateUsingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    //stringbuffer concatenation
    public static String concatenateUsingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }
}
