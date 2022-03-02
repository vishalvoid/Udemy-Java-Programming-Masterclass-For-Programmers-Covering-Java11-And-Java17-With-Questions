

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
       if(tonerLevel > -1 && tonerLevel < 101){
           this.tonerLevel = tonerLevel;
       }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount < 101){
            if(this.tonerLevel + tonerAmount <= 100){
                this.tonerLevel += tonerAmount;
            }
        }return -1;
    }

    public int printerPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint /= 2;
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;

        }else {
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
class Main{
    public static void main(String [] args) {

        Printer printer = new Printer(50, false);
        System.out.print("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printerPages(4);
        System.out.println("Pages printed was " + printer.getPagesPrinted() + " new total print count for printer =" + pagesPrinted);

                pagesPrinted = printer.printerPages(2);
        System.out.println("Page printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
