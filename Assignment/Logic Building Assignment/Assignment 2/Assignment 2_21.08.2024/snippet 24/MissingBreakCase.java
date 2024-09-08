public class MissingBreakCase {
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
		 break;
 case 2:
 System.out.println("Level 2");
		 break;
 case 3:
 System.out.println("Level 3");
		 break;
 default:
 System.out.println("Unknown level");
		 break;
 }
 }
}


/* Adding a break after every case and default will solve the problem*/