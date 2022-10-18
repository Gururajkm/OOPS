package com.corejava.oops.encapsulation;

public class Laptop 
{
private String brandName;
private int price;
private byte ram;

Laptop(){
	System.out.println("invoking Laptop constructor");
}
public String getbrandNmae() {
	return brandName;
}
public void setbrandName(String brandName) {
	
	this.brandName=brandName;
}

public int getprice() {
	return price;
}
public void setprice(int price) {
	this.price=price;
}
public byte getram() {
	return ram;
}
public void setram(byte ram) {	
}

public void print() {
	
System.out.println(brandName+"\t"+price+"\t"+ram);
}
}