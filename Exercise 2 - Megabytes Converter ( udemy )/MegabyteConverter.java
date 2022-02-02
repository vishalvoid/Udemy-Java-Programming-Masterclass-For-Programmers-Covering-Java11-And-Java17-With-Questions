package udemy.CodeBlocdsAndMethod;

public class MegabyteConverter {
    public static void main(String[] args) {
        PrintMegaByteAndKiloByte(-1032);
    }
    public static void PrintMegaByteAndKiloByte(int Kilobyte){
        int megaBytes=0;
        int kiloBytes=0;
        //invalid option
        if(Kilobyte <0){
            System.out.println("Invalid value");
        }else{
        //Calculation
            megaBytes = Kilobyte /1024;
            kiloBytes = Kilobyte % 1024;
            System.out.println(Kilobyte + " KB = " + megaBytes + " MB and " + kiloBytes + " KB " );
        }
    }
}
