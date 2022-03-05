
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int number = in.nextInt();
        ReverseArray rev = new ReverseArray();

        int[] array = rev.reverse(rev.readInteger(number));
        System.out.println(Arrays.toString(array));
    }

    private int[] readInteger(int num){
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            int number = in.nextInt();
            array[i] = number;
        }   return array;
    }

    private int[] reverse(int[] array){

       int maxValue = array.length -1;
       int halfValue = array.length /2;

        for (int i = 0; i < halfValue ; i++) {
            int temp = array[i];
            array[i] = array[maxValue-i];
            array[maxValue] = temp;

        }return array;
    }
}


// Write a method called reverse() with an int array as a parameter.

// The method should not return any value. In other words, the method is allowed to modify the array parameter.

// To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

// For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].

// The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]

// and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]

// TIP: When swapping the elements, use a variable to temporarily hold the current element.

// NOTE: The method should be defined as private static.

// NOTE: Do not add a main method to the solution code.