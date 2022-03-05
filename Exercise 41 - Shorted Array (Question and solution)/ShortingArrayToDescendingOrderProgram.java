package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortingArrayToDescendingOrderProgram {
    // Scanner to take input from user
    private static Scanner scan = new Scanner(System.in);

    // getInteger method to take input and store it inside a array.
    public int[] getIntegers(int number){
        // asking to put a value;
        System.out.println("please Enter " + number + " number.");
        // initialising a array;
        int[] valueIntake = new int[number];
        // loop to take value and store inside a array we just created;
        for(int i= 0; i< valueIntake.length; i++){
            valueIntake[i] = scan.nextInt();
        // returning the value of array;
        }return valueIntake;
    }
}
class otput{
    public static void main(String[] args) {
        // creating the object of parent class
        ShortingArrayToDescendingOrderProgram arr = new ShortingArrayToDescendingOrderProgram();
        // telling the length of array we want and also storing its value inside another array.
        int[] arrayResult = arr.getIntegers(5);

        // shorting starts here ;

        // initialization starts here
       boolean flag = true;
       int temp;

       while(flag) {
           flag = false;
           for (int i = 0; i < arrayResult.length - 1; i++) {
               // if to check if the value is greater than it or not. using swap method
               if (arrayResult[i] < arrayResult[i + 1]) {
                   temp = arrayResult[i];
                   arrayResult[i] = arrayResult[i + 1];
                   arrayResult[i + 1] = temp;
                   flag = true;
               }
           }
       }
       // finally printing the value of output;
        System.out.println(Arrays.toString(arrayResult));
    }
}

//
//    Create a program using arrays that sorts a list of integers in descending order.
//
//        Descending order is highest value to lowest.
//
//        In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
//
//        Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
//
//        Implement the following methods:
//
//        getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
//
//        printArray accepts an array and prints out the contents of the array. It should be printed in the following format:
//
//        Element 0 contents 106
//        Element 1 contents 81
//        Element 2 contents 26
//        Element 3 contents 15
//        Element 4 contents 5
//
//        sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.
//
//        The scenario is:
//
//        1. getIntegers() is called.
//
//        2. The returned array from getIntegers() is then used to call sortIntegers().
//
//        3. The returned array from sortIntegers() is then printed to the console.
//
//        [Do not try and implement this. It is to give you an idea of how the methods will be used]
//
//        TIP: you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array.
//
//        TIP: Instantiate (create) the Scanner object inside the method.
//
//        TIP: Be extremely careful about spaces in the printed message.
//
//        TIP: Make sure the Scanner class is imported.
//
//        NOTE: All methods should be defined as public static NOT public.
//
//        NOTE: Do not add a main method to the solution code.

