// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

import java.util.Scanner;
public class NumberOfDaysInMonth {
    // main method for to check the solution.
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Give Month & Year");
        int month = sc.nextInt();
        int year = sc.nextInt();
       if(isLeapYear(year)){
           System.out.println("No of days in Month " + getDaysInMonth(month,year) + ", " + year + " is a leap year");
       }else
           System.out.println("No of days in Month " + getDaysInMonth(month,year) + ", " +year + " is not leap year");
    }
    // 1st Method Initialising
    public static boolean isLeapYear(int year){
        // Invalid Options
       if( year >=1 && year <=9999 ){
           // Calculations
           return (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 );
       }return false;
   // 2nd Method Initialisation
    }public static int getDaysInMonth(int month , int year){
        //Invalid Options
        if(month >= 1 && month <=12 && year >=1 && year <=9999 ){
            // Variable declaration;
            int DaysInMonth = 0;
            // Using Switch case for each month.
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    DaysInMonth = 31;
                    break;
                case 2:
                    if(isLeapYear(year)){
                        DaysInMonth = 29;
                    }else
                        DaysInMonth = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    DaysInMonth = 30;

            }return DaysInMonth;
        }return -1;
    }
}

////////////////////////// Question //////////////////////////////

// Write a method isLeapYear with a parameter of type int named year.
// The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
// If the parameter is not in that range return false. Otherwise,
// if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
// A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400. Examples of input/output:
//   isLeapYear(-1600); – should return false since the parameter is not in the range (1-9999)
//   isLeapYear(1600); — should return true since 1600 is a leap year
//   isLeapYear (2017); – should return false since 2017 is not a leap year
//   isLeapYear(2000); – should return true because 2000 is a leap year
// NOTE: The solution to the Leap Year coding exercise earlier in the course created you can use here or create another.

// Write another method getDaysInMonth with two parameters month and year. Both of type int.
// If parameter month is < 1 or > 12 return -1. If parameter year is < 1 or > 9999 then return -1.
// This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
// You should check if the year is a leap year using the method isLeapYear described above.
// Examples of input/output:
//   getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
//   getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
//   getDaysInMonth(2, 2018); - should return 28 since February has 28 days if it's not a Leap year.

