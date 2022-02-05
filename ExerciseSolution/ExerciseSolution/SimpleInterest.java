package ExerciseSolution;
public class SimpleInterest {
    public static void main(String[] args) {
        // for 2 to 8
        for(int i=2;i<9;i++)
        System.out.println("interest for "+i+"% is :" + calcualteInterest(10000,i));
        // to create a gap between them.
        System.out.println("************************************************************");
        //for 8 to 2
        for(int i=9;i>=2;i--)
            System.out.println("interest for "+i+"% is :" + calcualteInterest(10000,i));
    }
    public static double calcualteInterest(double amount,double rate){
        return amount*rate/100;

    }
}
