package com.soj.principle.responsiblity;


public class BillCalculation {
    private Order order;

    public BillCalculation(Order order) {
        this.order = order;
    }

    public int calculateTotalAmt(){

        int totalAmt = this.order.getItemPrice() *
                this.order.getQuantity();
         order.setTotalBillAmt(totalAmt);
         return totalAmt;
    }

    public String calculateBill() {

       this.order.setTotalBillAmt(calculateTotalAmt());
        return "Order with order id " +
                this.order.getOrderId() +
                "has a total bill amount of " +
                this.order.getTotalBillAmt();
    }
}
