/*public class Main {
 public void display() {
 System.out.println("No parameters");
 }
 public void display(int num) {
 System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }
}

Main.java:9: error: non-static method display() cannot be referenced from a static context
 display();
 ^
Main.java:10: error: non-static method display(int) cannot be referenced from a static context
 display(5);
 ^
*/

/*The main method is static, meaning it belongs to the class rather than to any instance of the class. Static methods can only directly call other static methods or access static variables. However, the display() methods you defined are non-static, which means they belong to an instance of the Main class, not to the class itself.*/

public class Main {
    public void display() {
        System.out.println("No parameters");
    }

    public void display(int num) {
        System.out.println("With parameter: " + num);
    }

    public static void main(String[] args) {
        Main obj = new Main();  
        obj.display();          
        obj.display(5);      
    }
}
