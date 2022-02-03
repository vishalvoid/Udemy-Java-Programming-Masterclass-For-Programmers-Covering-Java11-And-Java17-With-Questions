// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.


public class BarkingDog {
    public static void main(String[] args) {
       System.out.println(ShouldWakeUp(false,2));
       
    }
    public static boolean ShouldWakeUp(boolean Barking, int HourOfDay){
        if(HourOfDay>0 || HourOfDay<23 ){
            if(Barking){
                return HourOfDay > 8 || HourOfDay < 22;
            }
        }return false;
    }
}

// We have a dog that likes to bark. we need to wake up if the dog is barking at night.
//
// Write a method shouldWakeUp that has 2 parameters.
//
// 1st parameter should e of type boolean and be named barking it represents if our dog is currently barking 2nd parameter represents the hour of the day and is of the type int with the name
// hourOfDay and has a valid range of 0-23.
//
// We have to wakeup if the dog is barking brfore 8 or after 22 hours so in that case return true in all other cases return false.
//
// TIP Use the if else statements as multiple conditions.
//

