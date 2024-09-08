/*public class Main {
 public static void main(String[] args) {
 int x = "Hello";
 System.out.println(x);
 }
} 

Main.java:3: error: incompatible types: String cannot be converted to int
 int x = "Hello";
         ^
1 error*/

/*The error "incompatible types: String cannot be converted to int" indicates that Java cannot assign a String value to a variable of type int. In Java, variables have a specific type, and you cannot assign a value of one type (e.g., String) to a variable of another incompatible type (e.g., int).*/

public class Main {
    public static void main(String[] args) {
        String x = "Hello"; // Assigning a string value to x
        System.out.println(x); // Output will be "Hello"
    }
}
