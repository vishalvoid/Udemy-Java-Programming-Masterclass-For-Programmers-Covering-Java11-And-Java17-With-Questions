// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1234565));
    }
    public static int sumFirstAndLastDigit(int number){
        //initialisation
       int box= 0;
       int box2 = number;
        //logic
       do{
           if(number == box2){
               int sum = number % 10;
               box += sum;
           } else if(number < 10 ){
               int sum = number % 10;
               box += sum;
           }
           number/=10;

       }while (number > 0);
       return box;
    }
}

//    First And Last Digit Sum
//        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//        The method needs to find the first and the last digit of the parameter number passed to the method,
//        using a loop and return the sum of the first and the last digit of that number.
//        If the number is negative then the method needs to return -1 to indicate an invalid value.
//                  Example input/output
//                   → should return 4, the first digit is 2 and the last is 2 which
//                   sumFirstAndLastDigit(252); gives us 2+2 and the sum is 4.
//                   sumFirstAndLastDigit(257); – should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
//                   sumFirstAndLastDigit(0); — should return 0, the first digit and the last digit is O since we only have 1 digit, which gives us 0+0 and the sum is 0.
//                   sumFirstAndLastDigit(5); – should return 10, the first digit and the last digit is 5 since
//
//
