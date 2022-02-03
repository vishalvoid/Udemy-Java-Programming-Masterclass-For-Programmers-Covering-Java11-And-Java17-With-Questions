// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class LeapYearCalculator {
    public static void main(String[] args) {
    boolean bool = isLeapYear(-1600);
        System.out.println(bool);
        bool = isLeapYear(1600);
        System.out.println(bool);
        bool = isLeapYear(2017);
        System.out.println(bool);
        bool = isLeapYear(2000);
        System.out.println(bool);

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
//
//
//
//
//
//
//
//
//
//
//
//
