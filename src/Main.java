import srp.*;
import ocp.*;
import isp.*;
import dip.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        order.productName = "Laptop";
        order.quantity = 2;
        order.price = 350000;

        PriceCalculator priceCalculator = new PriceCalculator();
        double total = priceCalculator.calculate(order);

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.process("VISA");

        EmailNotifier notifier = new EmailNotifier();
        notifier.send("user@mail.com");

        System.out.println("Total price: " + total);


        Employee emp1 = new PermanentEmployee();
        emp1.baseSalary = 300000;

        Employee emp2 = new ContractEmployee();
        emp2.baseSalary = 250000;

        Employee emp3 = new InternEmployee();
        emp3.baseSalary = 150000;

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println("Permanent salary: " + salaryCalculator.calculate(emp1));
        System.out.println("Contract salary: " + salaryCalculator.calculate(emp2));
        System.out.println("Intern salary: " + salaryCalculator.calculate(emp3));


        IPrinter printer = new BasicPrinter();
        printer.print("Hello ISP");


        AllInOnePrinter allInOne = new AllInOnePrinter();
        allInOne.print("Hello");
        allInOne.scan("Hello");
        allInOne.fax("Hello");


        List<IMessageSender> senders = List.of(
                new EmailSender(),
                new SmsSender()
        );

        NotificationService notificationService =
                new NotificationService(senders);

        notificationService.sendNotification("SOLID works");
    }
}
