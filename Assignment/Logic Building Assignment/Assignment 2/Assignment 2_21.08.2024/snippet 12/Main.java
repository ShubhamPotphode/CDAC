/*public class Main {
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 }
 }
}

program goes on printing "Infinite Loop" */

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 5) {
            System.out.println("Iteration: " + counter);
            counter++;
        }
    }
}