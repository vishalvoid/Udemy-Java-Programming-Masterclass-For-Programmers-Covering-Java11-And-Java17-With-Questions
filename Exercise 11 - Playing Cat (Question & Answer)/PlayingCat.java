// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,42));
        System.out.println(isCatPlaying(true,27));
        System.out.println(isCatPlaying(false,35));
        System.out.println(isCatPlaying(false,-2));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        int maxTemp = 35;
        if(summer){
            return temperature >= 25 && temperature <= (maxTemp + 10);

        }else{
            return temperature >= 25 && temperature <= maxTemp;
        }
    }
}

//The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive).
// Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
// Write a method IsCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
// 1st parameter should be of type boolean and be named summer it represents if it is summer. 
//2nd parameter represents the temperature and is of type int with the name temperature.
