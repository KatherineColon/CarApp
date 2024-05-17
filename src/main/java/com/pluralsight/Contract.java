package com.pluralsight;

public abstract class Contract {
   protected String dateOfContract, customerName, customerEmail, vehicleSold;
   protected double totalPrice, monthlyPayment;
    public Contract(String dateOfContract, String customerName, String customerEmail, String vehicleSold){
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }
    public String getDateOfContract(){
        return dateOfContract;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public String getVehicleSold(){
        return vehicleSold;
    }
    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();


}
