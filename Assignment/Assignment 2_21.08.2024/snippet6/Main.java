/*public class Main {
 public static void main(String[] args) {
 int x = y + 10;
 System.out.println(x);
 }
}

Main.java:3: error: cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main
1 error
*/

/* variables must be declared before they are used. A declaration tells the compiler the variable's type (e.g., int, String, etc.) and gives it a name*/

public class Main {
    public static void main(String[] args) {
        int y = 5; // Declare and initialize y
        int x = y + 10;
        System.out.println(x); // Output will be 15
    }
}