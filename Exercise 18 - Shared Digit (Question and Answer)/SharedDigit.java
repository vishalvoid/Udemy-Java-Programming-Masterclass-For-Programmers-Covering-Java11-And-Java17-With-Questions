// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class sharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 90));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 93));
        System.out.println(hasSharedDigit(77, 17));
    }
    public static boolean hasSharedDigit(int num1 , int num2){
        //invalid options
    if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
        return false;
    }
    int num1firstdigit = num1 % 10;
    int num2firstdigit = num2 % 10;
    num1 /= 10;
    num2 /= 10;
    int num1lastdigit = num1;
    int num2lastdigit = num2;
    if(num1firstdigit == num2firstdigit || num1firstdigit == num2lastdigit || num1lastdigit == num2firstdigit || num1lastdigit == num2lastdigit){
        return true;
    }
        return false;
    }
}

//    Shared Digit
//
//        Press Write a method named hasShared Digit with two parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive). 
//        If one of the numbers is not within the range, the method should return false. 
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, 
//        the method should return false.
//        EXAMPLE INPUT/OUTPUT: • 
//                  hasSharedDigit(12, 23); – should return true since the digit 2 appears in both numbers
//                  hasSharedDigit(9, 99); – should return false since 9 is not within the range of 1099
//                  hasSharedDigit(15, 55); – should return true since the digit 5 appears in both numbers
//       
