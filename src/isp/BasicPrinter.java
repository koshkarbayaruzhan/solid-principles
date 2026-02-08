package isp;

public class BasicPrinter implements IPrinter {
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
