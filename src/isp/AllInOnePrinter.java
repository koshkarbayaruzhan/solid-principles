package isp;

public class AllInOnePrinter implements IPrinter, IScanner, IFax {
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}
