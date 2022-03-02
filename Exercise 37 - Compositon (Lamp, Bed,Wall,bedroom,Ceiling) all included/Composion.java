

public class Composion {
    public static void main(String[] args) {
  
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        lamp Lamp = new lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, Lamp);
       bedRoom.getLamp().turnOn();
       bedRoom.getBed().make();

    }
}
//-------------------------------------class lamp--------------------------------------------//
class lamp{
    private String style;
    private boolean battery;
    private int globRating;

    public lamp(String style, boolean battery, int globRating){
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    public void turnOn(){
        System.out.println("lamp has been turned on via turnOn() method");
    }

    public String getStyle(){
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }
}
//-------------------------------------class Bed--------------------------------------------//
class Bed{
    private String style;
    private int pillows,height,sheets,quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt){
        this.pillows = pillows;
        this.height = height;
        this.style = style;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("Bed is being made via make() methos");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
//-------------------------------------class ceiling--------------------------------------------//
class Ceiling{
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor){
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
//-------------------------------------class Wall--------------------------------------------//
class Wall{
    private String direction;

    public Wall(String direction){
        this.direction = direction;
    }

    public String getDirection(){
        return direction;
    }
}
//-------------------------------------class Bedroom--------------------------------------------//
class Bedroom{
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private lamp Lamp;


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        Lamp = lamp;
    }
    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public lamp getLamp() {
        return Lamp;
    }

}