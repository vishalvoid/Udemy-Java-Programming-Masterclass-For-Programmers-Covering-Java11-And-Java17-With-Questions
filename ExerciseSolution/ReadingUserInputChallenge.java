import java.util.Scanner;
public class ReadingUserInputChallenge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while(counter <=10){
            System.out.println("Input value #" + counter);
           
            boolean hasNextInt = scan.hasNextInt();
            if(hasNextInt){
                int number = scan.nextInt();
                sum += number;
                counter ++;
            }else {
                System.out.println("please put a valid number");
            }
            scan.hasNextInt();
        }
        System.out.println("Total value is : " + sum );
    }
}
