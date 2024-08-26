public class Main {
 public static void main(String[] args) {
 System.out.println("Main method with String[] args");
 }
 public static void main(int[] args) {
 System.out.println("Overloaded main method with int[] args");
 }
}

/*
Main.java:9: error: illegal character: '\uf0b7'

^
Main.java:9: error: reached end of file while parsing

 ^
2 errors


The JVM only looks for public static void main(String[] args) as the entry point of the application. The other main method (public static void main(int[] args)) is just a regular static method that will not be called unless explicitly invoked within the code.*/