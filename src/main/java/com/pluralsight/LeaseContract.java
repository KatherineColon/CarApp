package com.pluralsight;

public class LeaseContract extends Contract {
    double expectedEndValue, leaseFee, monthlyPayment;
    public LeaseContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold,
                         double expectedEndValue,double leaseFee){
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.expectedEndValue= expectedEndValue;
        this.leaseFee = leaseFee;
    }

    public double getExpectedEndValue() {
        return expectedEndValue;
    }
    public double getLeaseFee(){
        return leaseFee;
    }
}
