// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class AllFactor {
    public static void main(String[] args) {
        printFactor(6);
        printFactor(32);
        printFactor(10);
        printFactor(-1);
    }
    public static void printFactor(int number){
        // for invalid value
        if(number<0)
            System.out.println("invalid value");
        for(int i=1; i<=number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}

// - Write a method named printerFactors with 1 parameter of type int named number
// - If number < 1, the method should print "Invalid Value"
// - The method should print all factors of the number. A factor of a number is an integer which divides that numbers wholy
//   (i.e. without leaving a remainder)
// HINT:
//   - Use a while or for loop statement 
// NOTE: 
//   - When printing numbers, each number can be in its own line. They don't have to be separated by a space
//   - The method printFactors shoud be defined as a public static 