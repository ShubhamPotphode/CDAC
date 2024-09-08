/*public class Main {
 public static void main(String[] args) {
 int num = 10;
 double result = num / 4;
 System.out.println(result);
 }
}

output is 2.0

If you were expecting 2.5, then the output might not be what you expected. The reason for this is the integer division that occurs before the result is assigned to the double variable.*/

public class Main {
    public static void main(String[] args) {
        int num = 10;
        double result = num / 4.0;  // Using 4.0 instead of 4 to force floating-point division
        System.out.println(result); // This will now output 2.5
    }
}