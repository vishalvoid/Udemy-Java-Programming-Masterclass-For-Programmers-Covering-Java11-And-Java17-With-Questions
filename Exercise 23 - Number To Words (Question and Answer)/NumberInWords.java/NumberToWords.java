// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(1000));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static void numberToWords(int number) {
        if (number >= 0) {
            // reversing the number
            int reversed = reverse(number);
            // counts the number of digits of given number
            int originalNumberDigits = getDigitCount(number);
            // iterates till all digits will be printed
            for (int i = 0; i < originalNumberDigits; i ++) {
                // extracting digit of given number
                int digit = reversed % 10;
                // printing last digit in words
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                // removing digit from a number
                reversed /= 10;
            }
        } else {
            // prints "Invalid Value" when it is less than zero
            System.out.println("Invalid Value");
        }
    }

    //   reverses the given number
    public static int reverse(int number) {
        int reversedNumber = 0;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }


    // counts the number of digits
    public static int getDigitCount(int number) {
        int sumOfDigits = 0;
        if (number >= 0) {
            if (number == 0) {
                sumOfDigits = 1;
            }
            while (number > 0) {
                int lastDigit = number % 10;
                number /= 10;
                sumOfDigits++;
            }
            return sumOfDigits;
        }
        return -1;
    }
}


// Method1: 
//         - Write a method called numberToWords with 1 int parameter named number
//         - The method should print out the passed number using word for the digits 
//         - If the number is negative, print "Invalid Value"
//  Steps to Print the Number as Words: 
//         1. Extract the last digit of the given number using the remainder operator
//         2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those
//            being 0,1,2,3,4,5,6,7,8,9. Print the corresponding word for each digit. e.g. print "Zero" if the digit is 0, "One"
//            if the digit is 1, and so on. 
//         3. Remove the last digit from the number
//         4. Repeat Step 2 through 4 until the number is 0
//  Method 2: 
//         - The logic abobe is correct, but in its current state, the words will be printed in reverse order. For example, if the
//           number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this
//           problem, write a second method called reverse.
//         - The method reverse should have 1 int parameter and return the reversed number(int). For example, if the number passed
//           is 234, then the reversed number would be 432. The method reverse should also reverse negative numbers
//         - Use the method reverse within the method numberToWords in order to print the words in the correct order. 
//         - Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). 
//           The logic above for the metho numberToWords will print "One", but that is incorrect. It should print "OneZeroOne". To
//           solve this problem, write a third method called getDigitCount
//  Method 3:
//         - The method getDigitCount should have 1 int parameter called number and return the count of the digits in that number.
//           If the number is negative, return -1 to indicate an invalid value. 
//         - For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 10 has 3 
//           digits (1,0,0).
//   HINTS: 
//         - Use a for loop statement to print zeroes after reversing the number. As seen in a previous example, 100 reversed 
//           becomes 1, but the method numberToWords should print "OneZeroZero". To get the number of zeroes, check the difference
//           between the digit count from the original number and the reversed number.
//   NOTES:
//         - When printing words, each word can be in its own line 
//         - They don't have to be separated by a space
//         - The method numberToWords, getDigitCount, reverse should be defined as public static 
//         - In total, you've 3 methods
