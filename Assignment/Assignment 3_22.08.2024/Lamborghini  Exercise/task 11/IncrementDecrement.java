public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 5;
        int result = ++i - i--;
        
        System.out.println("Final value of i: " + i);
        System.out.println("Result of the expression (++i - i--): " + result);
    }
}
