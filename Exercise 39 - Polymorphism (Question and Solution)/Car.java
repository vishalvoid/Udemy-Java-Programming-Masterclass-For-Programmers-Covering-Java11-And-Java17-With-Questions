public class abc {
    
  public static void main(String[] args){

      Car car = new Car(8, "Base car");
      System.out.println(car.startEngine());
      System.out.println(car.accelerate());
      System.out.println(car.brake());

      Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
      System.out.println(mitsubishi.startEngine());
      System.out.println(mitsubishi.accelerate());
      System.out.println(mitsubishi.brake());

      Ford ford = new Ford(6, "Ford Falcon");
      System.out.println(ford.startEngine());
      System.out.println(ford.accelerate());
      System.out.println(ford.brake());

      Holden holden = new Holden(6, "Holden Commodore");
      System.out.println(holden.startEngine());
      System.out.println(holden.accelerate());
      System.out.println(holden.brake());
  }
}

  class Car {
      private boolean engine;
      private int cylinders;
      private String name;
      private int wheels;

      //constructor
      public Car(int cylinders, String name){
          this.cylinders = cylinders;
          this.name = name;
          this.wheels = 4;
          this.engine = true;
      }
      // getters
      public int getCylinders(){
          return cylinders;
      }
      public String getName(){
          return name;
      }
      //methods
      public String startEngine(){
          return "Car -> startEngine()";
      }
      public String accelerate(){
          return "Car -> accelerate()";
      }
      public String brake(){
          return "Car -> brake()";
      }

  }// end of Car class
  /*************************************************************************************************************************************************/
  // sub classes
  class Mitsubishi extends Car{
      public Mitsubishi(int cylinders, String name){
          super(cylinders, name);
      }
      @Override
      public String startEngine(){
          return ("Mitsubishi -> startEngiin()");
      }
      @Override
      public String accelerate(){
          return "Mitsubishi -> accelerate()";
      }
      @Override
      public String brake(){
          return "Mitsubishi -> brake()";
      }
  }
  /******************************************************************************************************************************************************/
  class Holden extends Car {
      public Holden(int Cylinders, String name){
          super(Cylinders, name);
      }
      @Override
      public String startEngine(){
          return getClass().getSimpleName() + " ->  startEngine()";
      }
      @Override
      public String accelerate(){
          return getClass().getSimpleName() + " -> accelerate()";
      }
      @Override
      public String brake(){
          return getClass().getSimpleName() + " -> brake()";
      }
  }
  /********************************************************************************************************************************************************/
  class Ford extends Car{
      public Ford(int cylinders, String name){
          super(cylinders, name);
      }
      @Override
      public String startEngine(){
          return "Ford -> startEngin()";
      }
      @Override
      public String accelerate(){
          return "Ford -> accelerate()";
      }
      @Override
      public String brake(){
          return "Ford -> brake()";
      }
  }
  /********************************************************************************************************************************************************/



//   Car Analogy: 
//   - Create a base class called Car
//   - It should have a few fields that would be appropriate for a generic car class
//   - engine, cylinders, wheels, etc. 
//   - Constructors should initialize cylinders (number of) and name,  and set wheels to 4 and engine to true
//   - Cylinders and names would be passed parameters. 
//   - Create appropriate getters
//   - Create some methods like startEngine, accelerate, and brake 
//   - show a message for each in the base class
//   - Now, create 3 sub classes for your favorite vehicles
//   - Override the appropriate methods to demonstrate polymorphism n use
//   - put all classes in the one Java file (this one). 


















































