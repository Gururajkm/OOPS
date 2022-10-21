package com.crud.dto.dao;

public class Mobiledto {
	 private int mobileId;
	private String modelname;
	private String brandName;
	private int  price;
	private String SerielNumber;
	private short noOfCamera;

	public Mobiledto() {
		System.out.println("invoking mobile constructor");
	}
		
		public int mobileId() {
			return mobileId;
		}

		public void setmobileId(int mobileId) {
			this.mobileId = mobileId;
		}

		public String  modelname() {
			return  modelname;
		}

		public void setmodelname(String  modelname) {
			this. modelname =  modelname;
		}
		public String getbrandName() {
			return brandName;
		}
		public void setbrandName(String brandName) {
			this.brandName=brandName;
		}
		 public int getprice() {
			return price;
		}

		public void setprice1(int price) {
			this.price = price;
		}

		public String getSerielNumber() {
			return SerielNumber;
		}

		public void setSerielNumber(String SerielNumber) {
			this.SerielNumber = SerielNumber;
		}

		public short getnoOfCamera() {
			return noOfCamera;
		}

		public void setnoOfCamera(short noOfCamera) {
			this.noOfCamera = noOfCamera;
		}

		public void setnoOfCamera(int i) {
			// TODO Auto-generated method stub
			
		
			
		}

		



}
