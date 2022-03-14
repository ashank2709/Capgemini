package com.cg.user;

public class Invoiceitem {
	
	private String id;
	private String desc;
	private int qty;
	private double unitprice;



	public Invoiceitem( String id, String desc, int qty, double unitprice ) {
	id="A101";
	desc="pen red";
	qty=888;
	unitprice=0.08;



	}



	public String getID() { 
	return id;
	}
	public String desc() {
	return desc;
	}
	public void setQty(int qty) {
	this.qty=qty;
	}



	public double getunitprice() {
	return unitprice;
	}



	public void setUnitprice(double unitprice) {
	this.unitprice=unitprice;
	}



	public String toString() {
	return "invoiceitem[(id=A110, desc=notebook, qty=100, unitprice=199.8)]";
	}





	public String getDesc() {
	return desc;
	}



	public double getTotal() {
	return unitprice*qty;
	}





	public int getQty() {
	// TODO Auto-generated method stub
	return qty;
	}
	}


