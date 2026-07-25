package arrays;

/*
 * Problem: Remove Digit to Maximize Number
 * Topic: Arrays
 * Language: Java
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */



public class RemoveDigitToMaximizeNumber {

    public static int maximizeNumber(String s, char digit){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == digit) {
                String temp = s.substring(0, i) + s.substring(i + 1);

                int curr = Integer.parseInt(temp);
                max = Math.max(max, curr);
            }
        }
        return max;
    }
    public static void main(String[] args) {
       System.out.println( maximizeNumber("1321", '1'));
    }
}
