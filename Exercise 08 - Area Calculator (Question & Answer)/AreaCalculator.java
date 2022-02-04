// Question is provided below The Actual Code.
// I am using main method because I'm using intellij-idea.

public class AreaCalculator {
    public static void main(String[] args){
        System.out.println(area(5.0));
        System.out.println(area(-5,-4));
        System.out.println(area(-5.0));

    }
    //Area of Circle
    public static double area(double radius){
        //invalid value
        if(radius<0){
            return -1;
        //calculation
        }return Math.PI*radius*radius;
    }
    //Area of rectangle
    public static double area(double length, double width){
        //invalid value
        if(length<0 || width <0){
            return -1;
        //calculation
        }return length*width;
    }
}


// Write a method named area with one double parameter named radius.
// The method needs to return a double value that represents the area of a circle.
// If the parameter radius is negative then return -1.0 to represent an invalid value.
// Write another overloaded method with 2 parameter x and y (both double) where x and y represent the side of a rectangle.
// The method needs to retuen an area of rectangle.
// if either or both parameters is/are negative return -1.0 to indicate an invalid value.

// TIP : The formula for calculating the area of rectangle is x*y.
// TIP : The formula for calculating the area of circle is radius * radius * PI.
// TIP : For PI use a constant from Math class e.g. Math.PI
