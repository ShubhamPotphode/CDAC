public class FibonacciSequence{
    public static void main(String[] args){
    int n1=0, n2=1, n3;

       System.out.print(n1 + " "+n2);

        for ( ; ; ) {
            n3= n1 + n2;
            if (n3>21)
            break;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;

        }
    }
}
