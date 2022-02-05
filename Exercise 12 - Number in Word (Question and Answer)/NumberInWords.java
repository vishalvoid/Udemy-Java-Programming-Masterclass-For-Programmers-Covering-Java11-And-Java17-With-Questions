// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class NumberInWords {
    public static void main(String[] args) {
        printNumberInWord(4);
        printNumberInWord(10);

    }public static void printNumberInWord(int Number){
        switch(Number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    // Write a method called printNumberInWord. the method has one parameter number
    // which is the whole number. the method needs to print "ZERO", "ONE", "TWO"...."NINE","OTHER" if the int parameter number is 
    // 0,1,2,.....9, or other for any other number including negative numbers.
    // You can use if-else statement or switch statement whichever is easier for you.
}
