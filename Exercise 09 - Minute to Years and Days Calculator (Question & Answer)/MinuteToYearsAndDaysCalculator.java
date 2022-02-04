// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int totalYears = (int) (minutes / (365 * 24 * 60));
            int totalDays = (int) (minutes % (365 * 24 * 60)) / (24 * 60);
            System.out.println(minutes + " min = " + totalYears + " y and " + totalDays + " d");
        }

    }

}

// Write a method printYearsAndDays with parameter of type long named minutes.
// The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
// If the parameter is less than 0, print text "Invalid Value",Otherwise,
// if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d.
// XX represents the original value minutes. 
// YY represents the calculated years.
// ZZ represents the calculated days.
//