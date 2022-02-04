import javax.lang.model.util.ElementScanner6;

//create a method with name has EqualSum and pass three integer as a peremeter
//if the sum of first two integer is equal to third return true otherwise return false
//method should return boolean
public class EqualSumChecker{
    public static void main(String[] args){
        System.out.println(EqualSum( 15 , 15 , 30)); 
        System.out.println(EqualSum( 23, 45 , 67));   
    }
     public static boolean EqualSum(int a , int b, int c ){
        
     if (a + b == c){
     return true;
     }else{
       return false;}

     }


}