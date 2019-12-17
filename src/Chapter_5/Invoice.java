package Chapter_5;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;

    public Invoice(String partNumber,String partDescription,int quantity,double unitPrice){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0)
            this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice >= 0) {
            this.unitPrice = unitPrice;
        }
    }

    double getInvoiceAmount() {
        if (this.quantity >= 0) {
            return (double) this.quantity * this.unitPrice;
        }else {
            return 0;
        }
    }


}
