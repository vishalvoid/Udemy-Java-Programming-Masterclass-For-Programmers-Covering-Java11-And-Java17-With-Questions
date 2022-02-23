public class Wall {
    private double width;
    private double height;
    // First Constructor Called
    public Wall(){

    }
    // Second Constructor Called
    public Wall(double width1, double height1){
        if(width1 < 0){
            this.width = 0;
        }else this.width = width1;
        if(height1 < 0){
            this.height = 0;
        }else this.height = height1;
    }

    // Method First (Getter Method)
    public double getWidth(){
        return width;
    }
    // Method Second (Getter Method)
    public double getHeight(){
        return height;
    }
    // Method Third (Setter Method)
    public void setWidth(double width1){
        if(width1 < 0){
            this.width = 0;
        }else this.width = width1;

    }
    //Method Fourth (Setter Method)
    public void setHeight(double height1){
        if(height1 < 0){
            this.height = 0;
        }else this.height = height1;
    }
    // Method Fifth (Getter Method for finding the Area of the program.
    public double getArea(){
        return this.height * this.width;

    }

}

class Main{
    public static void main(String[] args){
        Wall wall = new Wall(5,4);
        System.out.println("area is : " + wall.getArea());

        wall.setHeight(-2.3);
        System.out.println("Height : " + wall.getHeight());
        System.out.println("Width : " + wall.getWidth());
        System.out.println("area : " + wall.getArea());

    }
}

//    Write a class with name Wall.The class needs to have two fields(instance variable) with name width and height of type double
//        - The class needs to have two constructors.
//        * The first constructor does not have any parameters(no-arg constructor).
//        * The second constructor has parameters width and height of type double and it needs to initialize the fields.
//        * In case the width is less than 0, it needs to set the width field value to 0.
//        * In case the height parameter is less than 0, it needs to set the height field value to 0.
//        - Write the   following methods(instance methods)
//        * Method named getWidth without any parameters, it needs to return the value of width field.
//        * Method named getHeight without any parameters, it needs to return the value of height field.
//        * Method named setWidth  with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0, it needs to set the
//        width field value to 0.
//        * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0, it needs to the the
//        height field value to 0.
//        * Method named getArea without any parameters, it needs to return the area of the wall.
//        NOTE:
//        - All methods should be defined as public NOT public static
//    - In total,  you've to write 5 methods and 2 constructors.
