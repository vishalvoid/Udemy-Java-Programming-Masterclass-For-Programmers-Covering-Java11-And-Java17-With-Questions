// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class IntEqualPrinter {
    public static void main(String[] args){
        IntEqualPrinter.equalPrinter(1,1,1);
        IntEqualPrinter.equalPrinter(1,1,2);
        IntEqualPrinter.equalPrinter(-1,-1,-1);
        IntEqualPrinter.equalPrinter(1,2,3);
    }
    public static void equalPrinter(int a, int b , int c){
        if(a<0 || b<0 || c<0){
            System.out.println("invalid value");
        } else if(a==b && b==c && a==c){
            System.out.println("All the numbers are equal");
        }else if(a!=b && b!=c && a!=c){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }

}

//Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
//If one of the parameters is less than 0, print text "Invalid Value".
//If all numbers are equal print text "All numbers are equal"
//If all numbers are different print text "All numbers are different".
//Otherwise, print "Neither all are equal or different",

