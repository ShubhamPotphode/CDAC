/*public class Main {
 public static void main(String[] args) {
 static void displayMessage() {
 System.out.println("Message");
 }
 }
}

Main.java:3: error: illegal start of expression
 static void displayMessage() {
 ^
Main.java:7: error: class, interface, or enum expected
}
^
2 errors

Syntax Error: Declaring a method (displayMessage) inside another method (main) is not allowed.
Impact: The code will not compile due to illegal method declaration.
Correct Approach: Declare methods at the class level, not inside other methods, and call them from within methods as needed.

*/

public class Main {
    public static void main(String[] args) {
        displayMessage(); 
    }

    
    public static void displayMessage() {
        System.out.println("Message");
    }
}
