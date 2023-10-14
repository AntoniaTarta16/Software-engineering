public class GoodPrintingService {
    private InvoicePrinter invoicePrinter=null;
    public GoodPrintingService(InvoicePrinter invoicePrinter) {
        this.invoicePrinter = invoicePrinter;
    }

    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }
}
