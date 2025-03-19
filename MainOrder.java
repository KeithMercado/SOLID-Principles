public class MainOrder implements TotalCalculator, OrderPlacer {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;

    }

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
        
    }
}