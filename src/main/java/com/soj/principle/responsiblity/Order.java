package com.soj.principle.responsiblity;



import java.security.SecureRandom;
import java.util.Random;

public class Order {
    Random random = new SecureRandom();
    private Customer customer;
    private String orderId;
    private String itemName;
    private int quantity;
    private int itemPrice;
    private int totalBillAmt;

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {

        this.orderId = orderId + "_" + random.nextInt(500);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        setOrderId(itemName);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalBillAmt() {
        return totalBillAmt;
    }

    public void setTotalBillAmt(int totalBillAmt) {
        this.totalBillAmt = totalBillAmt;
    }

    public String prepareOrder() {
        return "Preparing order for customer - " +
                this.getCustomer().getName() + "" +
                "who has ordered " + this.getItemName();
    }
}
