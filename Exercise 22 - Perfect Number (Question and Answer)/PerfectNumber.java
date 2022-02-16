// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(5));
        System.out.println(isPerfect(-1));
    }
    public static boolean isPerfect(int number){
        //invalid options
        if(number < 1){
            return false;
        }
        int sum = 0; //initialisation
        for(int i = 1; i<number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }
}

// - A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
// - Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and 
//   exclude the perfect number itself. 6 is a perfect number
// * Write a method named isPerfectNumber with 1 parameter of type int named number 
// * If number is < 1, the method should return false
// * The method must calculate if the number is perfect. If the number is perfect, the method should retrun true; otherwise, 
//   it should return false. 
// HINT: 
//   - Use a while or for loop statement 
//   - Use the remainder operator 
// NOTE: 
//   - The method isPerfectNumber should be defined as public static 
