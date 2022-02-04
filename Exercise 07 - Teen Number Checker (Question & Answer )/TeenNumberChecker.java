// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class TeenNumberChecker {
    // Written to Check Code.
    public static void main(String[] args) {
            boolean bool = isteen(20,15,36);
            System.out.println(bool);

        bool = isteen(20,15,16);
        System.out.println(bool);

        bool = isteen(20,99,36);
        System.out.println(bool);

        bool = isteen(20,-15,36);
        System.out.println(bool);
        
        // Actual Solution of the code.
    }
    public static boolean isteen(int num1, int num2, int num3){
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }
}

/////////////////     1     //////////////////
//
// We'll say that a number is "teen" if it is in the range 13-19(inclusive)
//
// Write a method name hasTeen with 3 parameters of type int.
//
// The method should return boolean and it needs to return true if one of the parameters is in range 13-19 Otherwise return false.
//
/////////////////     2     /////////////////
//
// Write another method named isTeen with 1 parameter of type int.
//
//The method should return boolean and it needs to return true if the parameter is in range 13-19 otherwise return false.
//