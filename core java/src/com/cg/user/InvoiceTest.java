package com.cg.user;

public double getPricePreItem() {
    return pricePreItem;
}

public double getInvoiceAmount() {
    return pricePreItem * quantityOfPurchased;
}
}

public class InvoiceTest {
public static void main(String[] args) {
    Invoice i1 = new Invoice("99F", "Toy", 10, 1.5);
    System.out.println("Part number: " + i1.getPartNumber() + "; Part description: " + i1.getPartDescription() +
            "; Sold: " + i1.getQuantityOfPurchased1() + "; Price: " + i1.getPricePreItem() + "; Invoice amount: " +
            (
            		i1).getInvoiceAmount());
    i1.setPartNumber("0x000");
    i1.setPartDescription("IBM");
    i1.setQuantityOfPurchased(1000);
    i1.setPricePreItem(1500.99);
    System.out.println("After changing:");
    System.out.println("Part number: " + i1.getPartNumber() + "; Part description: " + i1.getPartDescription() +
            "; Sold: " + i1.getQuantityOfPurchased1() + "; Price: " + i1.getPricePreItem() + "; Invoice amount: " +
            i1.getInvoiceAmount());
}
}

}
