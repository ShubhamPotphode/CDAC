import java.util.Scanner;

class NonRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("Non-repeated characters: ");
        findNonRepeated(str, 0);  // Start checking from index 0// t
    }

    // Recursive function to find non-repeated characters
    static void findNonRepeated(String str, int i) {//nitin,0
        if (i >= str.length()) {
            return; // End of the string
        }
        
        boolean isRepeated = false;
        
        // Compare current character with every other character
        for (int j = 0; j < str.length(); j++) {//j=0;j<6;
            if (str.charAt(i) == str.charAt(j) && i!=j) { // Comparing without extra complexity // h
                isRepeated = true;
                break;  // Exit loop if character is repeated
            }
        }

        // If the character is not repeated, print it
        if (isRepeated==false) {
            System.out.print(str.charAt(i) + " ");// t
        }
        
        // Move to the next character
        findNonRepeated(str, i + 1);//nitin,5
    }
}
