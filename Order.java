public class Order {
    TotalCalculator totalCalculator;
    OrderPlacer orderPlacer;
    InvoiceGenerator invoiceGenerator;
    EmailNotifier emailNotifier;

    public Order(TotalCalculator totalCalculator, OrderPlacer orderPlacer, InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier) {
        this.totalCalculator = totalCalculator;
        this.orderPlacer = orderPlacer;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        double total = totalCalculator.calculateTotal(price, quantity);
        System.out.println("Order total: $" + total);
        orderPlacer.placeOrder(customerName, address);

        invoiceGenerator.generateInvoice(fileName);
        emailNotifier.sendEmailNotification(email);
        
    }
}