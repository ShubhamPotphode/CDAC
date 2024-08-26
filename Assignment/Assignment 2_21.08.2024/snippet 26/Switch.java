/*public class Switch {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5"); 
 break;
 case 5:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
} 

Switch.java:8: error: duplicate case label
 case 5:
 ^
1 error


Unique Labels Requirement: In a switch statement, each case label must correspond to a unique constant expression. The purpose of the switch is to branch execution based on the value of the expression provided (in this case, number). If two case labels have the same value, the compiler cannot determine which branch to execute when that value is encountered. This ambiguity violates the switch statement's design, leading to a compilation error.*/

public class Switch {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5"); 
 break;
 case 6:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
} 


