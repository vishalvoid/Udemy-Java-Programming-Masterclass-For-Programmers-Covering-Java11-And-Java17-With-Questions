// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        // invalid value
        if(first<10 || second<10){
            return -1;
        }
        //to find the maximum of two numbers
        int maximum = 0;
        int GreatestDivisor = 0;
        if(first>second){
            maximum = first;
        }else
            maximum = second;

        for(int i=1; i<=maximum; i++){
           if(first % i == 0 && second % i == 0){
               GreatestDivisor = i;
           }
        }return GreatestDivisor;
    }
}

// - Write a method named getGreatestCommonDivisor with 2 parameters of type int named first and second
// - If one of the parameters < 10, the method should return -1 to indicate an invalid value.
// - The method should return the greatest common divisor of the two numbers (int)
// - The greatest common divisor is the largest positive integer that can fully divide each of the integers(i.e. without leaving
//   a remainder)
// HINT:
//   - Use a while or for loop statement and check if both numbers can be divided without a remainder
//   - Find the minimum of the two numbers.
// NOTE:
//   - The method getGreatestCommonDivisor should be defined as a public static
