// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class DecimalComparator{
    public static void main(String[] args) {
        boolean bool = CalculateDouble(20.323,20.324);
        System.out.println(bool);
        bool = CalculateDouble(21.323,20.324);
        System.out.println(bool);
        bool = CalculateDouble(-20.323,20.324);
        System.out.println(bool);
        bool = CalculateDouble(20.323,20.324);
        System.out.println(bool);

    }
    public static boolean CalculateDouble(double number1,double number2){
        int convertedNumber1 = (int)number1*100;
        int convertedNumber2 = (int)number2*100;
        return convertedNumber1 == convertedNumber2;
    }
}

// Decimal Comparator (Comparing two digits after decimal)
//
// Write a method of two parameter type double.
//
// The method should return boolean and it needs to return true if the value is same upto two decimals.
// Otherwise return false.
//
// Tip: Do not use math.round method.
//
// Return true:
// ex : 3.123-3.123 , 4.124-4.125 , 2.12-2.12
//

