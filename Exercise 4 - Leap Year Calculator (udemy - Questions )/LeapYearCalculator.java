// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class LeapYearCalculator {
    public static void main(String[] args) {
                 // to check if it is true
    boolean bool = isLeapYear(-1600);
        System.out.println(bool);
        bool = isLeapYear(1600);
        System.out.println(bool);
        bool = isLeapYear(2017);
        System.out.println(bool);
        bool = isLeapYear(2000);
        System.out.println(bool);
    
                // actual code starts here.
    }
    public static boolean isLeapYear(int year){
       if(year>0 && year < 9999){
           if(year % 4 == 0 ){
               if(year % 100 == 0){
                   return year % 400 == 0;
               }return true;
           }return false;
       }return false;
    }
}

// Write a method isLeapYear with a parameter of type int named year.
//
// The paremeter needs to be greater than or equal than or equal to 1 and less than or equal to 9999.
//
// if the parameter is not in that renge return false.
//
// Othersiwe if it is in the range calculate if the year is a leap and return true if it is a leap year otherwise return false to determine whether a year is a leap year. Follow the steps:
//
// 1. if the year is evenly divisible by 4 . go to step 2 otherwise go to step 5.
// 2. if the year is evenly divisible by 100 go to step 3. otherwise go to step 4.
// 3. if the year is evenly divisible by 400. go to step 4 otherwise go to step 5.
// The year is a leap year if it has 366 days. the method isLeapYear meeds to return true.
// The year is not a leap year if it ias 365 days. The method isLeap Year needs to return false.
//
// followings are not leap year.
// 1700, 1800 , 1900 , 2100 , 2200 , 2500 , 2600
//
// followings are leap year.
// 1600 , 2000 , 2400
//
//

