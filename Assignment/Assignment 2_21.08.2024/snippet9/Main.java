/*public class Main {
 public static void main(String[] args) {
 int class = 10;
 System.out.println(class);
 }
} 

Main.java:3: error: not a statement
 int class = 10;
 ^
Main.java:3: error: ';' expected
 int class = 10;
    ^
Main.java:3: error: <identifier> expected
 int class = 10;
          ^
Main.java:4: error: <identifier> expected
 System.out.println(class);
                   ^
Main.java:4: error: illegal start of type
 System.out.println(class);
                    ^
Main.java:4: error: <identifier> expected
 System.out.println(class);
                         ^
Main.java:6: error: reached end of file while parsing
} 
 ^
7 errors*/

/*Java reserves certain words (like class, int, if, while, etc.) to use for its own syntax rules. These keywords are part of the Java language structure and therefore cannot be used for other purposes, such as naming variables, methods, or classes.*/




public class Main {
    public static void main(String[] args) {
        int number = 10; // Use a different identifier name
        System.out.println(number);
    }
}
