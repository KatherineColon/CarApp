package com.pluralsight;

public class SalesContract extends Contract{
    float salesTax, recordingFee, processingFee;
    boolean finance;
    double monthlyPayment;
    public SalesContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold,
                         float salesTax, float recordingFee, float processingFee, boolean finance){
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
    }
    public float getSalesTax(){
        return salesTax;
    }

    public float getRecordingFee() {
        return recordingFee;
    }
    public float getProcessingFee(){
        return processingFee;
    }
    public boolean isFinance(){
        return finance;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
    @Override
    public double getMonthlyPayment(){
        return 0;
    }
}
