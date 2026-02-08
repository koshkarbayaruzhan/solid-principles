package srp;

public class PriceCalculator {
    public double calculate(Order order) {
        return order.quantity * order.price * 0.9;
    }
}
