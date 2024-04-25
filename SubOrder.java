public class SubOrder implements InvoiceGenerator, EmailNotifier {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("PDF Invoice generated: " + fileName);
    }

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}