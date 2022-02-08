

public class EvenDigitSum {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(1234));
    }
    public static int getEvenDigitSum(int number){
        //initialisation
        int sum = 0;
        int box = 0;
        // invalid options
        if (number < 0) {
            return -1;
        }
            while (number >= 0) {
                if (number % 2 == 0) {
                    sum = number % 10;
                    box += sum;
                }
                number /= 10;

            }
            return box;
       
    }
}

//    Even Digit Sum
//        Press Write a method named getEven DigitSum with one parameter of type int called number.
//        The method should return the sum of the even digits within the number.
//        If the number is negative, the method should return - 1 to indicate an invalid value.
//        EXAMPLE INPUT/OUTPUT:
//        •
//               getEvenDigitSum(123456789); – should return 20 since 2 + 4 + 6 + 8 = 20 
//               getEvenDigitSum(252); – should return 4 since 2 + 2 = 4 
//               getEvenDigitSum(-22); → should return -1 since the number is negative
//      
