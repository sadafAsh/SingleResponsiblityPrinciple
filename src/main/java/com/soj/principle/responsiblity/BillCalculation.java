package com.soj.principle.responsiblity;


public class BillCalculation {
    private Order order;

    public BillCalculation(Order order) {
        this.order = order;
    }

    public String calculateBill() {

        int totalAmt = this.order.getItemPrice() *
                this.order.getQuantity();
        this.order.setTotalBillAmt(totalAmt);
        return "Order with order id " +
                this.order.getOrderId() +
                "has a total bill amount of " +
                this.order.getTotalBillAmt();
    }
}
