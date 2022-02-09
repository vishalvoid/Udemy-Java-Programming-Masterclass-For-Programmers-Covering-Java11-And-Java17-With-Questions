// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasLastDigitChecker(1,21,111));

    }
    public static boolean hasLastDigitChecker(int num1, int num2, int num3){
        if(num1 < 10 || num1 > 999||num2 < 10 || num2 > 999||num3 < 10 || num3 > 999){
            return false;
        }
        int firstRightmostDigit = num1 % 10;//
        int SecondRightmostDigit = num2 % 10;
        int thirdRightmostDigit  = num3 % 10;
        return firstRightmostDigit == SecondRightmostDigit || firstRightmostDigit == thirdRightmostDigit || SecondRightmostDigit == thirdRightmostDigit;

    }
    public static boolean isValid(int validnumber){
        return validnumber >= 10 && validnumber <= 1000;
    }
}

// Method1:
//   - Write a method named hasSameLastDigit with 3 parameters of type int. 
//   - Each number should be within the range of 10(inclusive) - 1000(inclusive). If one of the numbers is not within the range,
//     the method should return false. 
//   - The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return 
//     false. 
// Method2:
//   - Write another method named isValid with one parameter of type int
//   - The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise, return
//     false. 
// NOTE:
//   - All methods needs to be defined as a public static 
