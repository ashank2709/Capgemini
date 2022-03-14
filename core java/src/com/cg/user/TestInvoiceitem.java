package com.cg.user;

public class TestInvoiceitem {
	   public static void main(String[] args) {
	      // Test constructor and toString()
	      Invoiceitem inv1 = new Invoiceitem("A101", "Pen Red", 888, 0.08);
	      System.out.println(inv1);  // toString();

	      // Test Setters and Getters
	      inv1.setQty(999);
	      inv1.setUnitprice(0.99);
	      System.out.println(inv1);  // toString();
	      System.out.println("id is: " + inv1.getID());
	      System.out.println("desc is: " + inv1.getDesc());
	      System.out.println("qty is: " + inv1.getQty());
	      System.out.println("unitPrice is: " + inv1.getunitprice());

	      // Test getTotal()
	      System.out.println("The total is: " + inv1.getTotal());
	   }
	}


