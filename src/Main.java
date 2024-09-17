public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Laptop", 2, 800);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount());

        invoice.setQuantity(-5);
        invoice.setPricePerItem(-100);

        System.out.println("\nUpdated Invoice Information:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount());
    }
}

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("A100", "Mouse", 3, 25.50);
        Invoice invoice2 = new Invoice("B200", "Keyboard", -4, 45.00);
        Invoice invoice3 = new Invoice("C300", "Monitor", 1, -150.00);

        System.out.println("Invoice 1 Amount: " + invoice1.getInvoiceAmount());
        System.out.println("Invoice 2 Amount: " + invoice2.getInvoiceAmount());
        System.out.println("Invoice 3 Amount: " + invoice3.getInvoiceAmount());

        invoice1.setQuantity(5);
        invoice1.setPricePerItem(30.00);

        System.out.println("\nUpdated Invoice 1:");
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: " + invoice1.getPricePerItem());
        System.out.println("Total Amount: " + invoice1.getInvoiceAmount());
    }
}
