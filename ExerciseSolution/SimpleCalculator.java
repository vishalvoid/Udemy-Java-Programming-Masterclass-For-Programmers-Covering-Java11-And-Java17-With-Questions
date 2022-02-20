public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubstractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplication(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else return firstNumber / secondNumber;
    }
}
 class main{
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(20);
        calculator.setSecondNumber(125);
        System.out.println("Addition : "+ calculator.getAdditionResult());
        System.out.println("substraction" + calculator.getSubstractionResult());
        calculator.setSecondNumber(0);
        calculator.setFirstNumber(5);
        System.out.println("Multiplication" + calculator.getMultiplication());
        System.out.println("Division" + calculator.getDivisionResult());
        calculator.setSecondNumber(2);
        System.out.println("Division 2: " + calculator.getDivisionResult());



    }
}
