public class OrderTest {
    public static void main(String[] args) {
        
        TotalCalculator totalCalculator = new MainOrder();
        OrderPlacer orderPlacer = new MainOrder();
        InvoiceGenerator invoiceGenerator = new SubOrder();
        EmailNotifier emailNotifier = new SubOrder();
        Order order = new Order(totalCalculator, orderPlacer, invoiceGenerator, emailNotifier);

        order.processOrder( 10.0, 2,"John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}
