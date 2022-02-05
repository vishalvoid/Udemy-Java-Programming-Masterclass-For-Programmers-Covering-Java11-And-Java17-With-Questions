package ExerciseSolution;
public class ThreePrime {

    public static void main(String[] args){
        int counter = 0;
        for(int i = 1; i == 10000;i++ ){
                if(isPrime(i)){
                    System.out.println(i);
                     counter ++;
                }
                if(counter == 3)break;
        }
    }
    
  public static boolean isPrime(int n){
      if(n==1){
          return false;
      }
      for(int i=2; i <= n/2; i++){
          if(n % i == 0){
              return false;
          }
      }return true;
  }
}


