// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.


public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.25));
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long round = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + round + " mi/h");
        }
    }
}
////////////////////          1           //////////////////
// write a method called toMilesPerHour that has 1 perimeter of type double with the name kilometersPerHour
// This method needs to return the rounded value of the calculation of type long.
//
// if the parameter kilometerPerHour is Less than 0. the method toMilesPerHour needs to return -1 to indicate an invalid value.
//
// Otherwise if the positive - calculate the value of miles per hour. round it and return it. For conversion and rounding.
//
//Example of input output:-
// toMilesPerHour(1.5); - return value 1
// toMilesPerHour(10.25); - return value 6
// toMilesPerHour(-5.6); - return value -1
// toMilesPerHour(25.42); - return value 16
//
////////////////////          2           //////////////////
// Write another method called printConversion with 1 parameter of type double with the name kilometerPerHour.
// This method should not return anything (void) and it needs to calculate milesPerHour from the kiometerPerHour parametr.
// then it needs to print a message in the format "XX km/h = YY mi/h".
