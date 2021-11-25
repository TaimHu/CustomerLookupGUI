package model;

public class Customer {

	//**********DO NOT MODIFY ANYTHING IN THIS FILE! ***************
	
	private String fName;
	private String lName;
	private int phoneNumber;
	private double billAmount;
	private String notes;
	private String pictureFile;
	
	

	public Customer(String fName, String lName, int phoneNumber, double billAmount, String notes, String pictureFile) {

		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.billAmount = billAmount;
		this.notes = notes;
		this.pictureFile = pictureFile;
	}
	
	public String getfName() {
		return fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public double getBillAmount() {
		return billAmount;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getPictureFile() {
		return pictureFile;
	}
	
	@Override
	public String toString()
	{
		return "Customer First Name: " + fName + ", Last Name: " + lName + "\n\tphoneNo: " + phoneNumber + " billAmount: " + billAmount + " pictureFile: " + pictureFile + "\n\tNotes: " + notes; 
	}
	
}
