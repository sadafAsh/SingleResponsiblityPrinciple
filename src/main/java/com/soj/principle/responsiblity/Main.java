package com.soj.principle.responsiblity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Johjn");
        customer.setAddress("Pune");

        Order order = new Order();
        order.setItemName("Pizza4");
        order.setQuantity(1);
        order.setCustomer(customer);
        order.setItemPrice(100);
        String prepareOrder=order.prepareOrder();
        logger.debug(prepareOrder);
        BillCalculation billCalculation = new BillCalculation(order);
        String calculateBill=billCalculation.calculateBill();
        logger.debug(calculateBill);

        DeliveryApp deliveryApp = new DeliveryApp(order);
        String delivery=deliveryApp.delivery();
        logger.debug(delivery);

        Customer customer1 = new Customer();
        customer1.setName("John");
        customer1.setAddress("Pune3");
        Order order1 = new Order();
        order1.setItemName("Pizza");
        order1.setQuantity(2);
        order1.setCustomer(customer1);
        order1.setItemPrice(200);
        String prepareOrder1=order1.prepareOrder();
        logger.debug(prepareOrder1);
        BillCalculation billCalculation1 = new BillCalculation(order1);
        String calculateBill1=billCalculation1.calculateBill();
        logger.debug(calculateBill1);

        DeliveryApp deliveryApp1 = new DeliveryApp(order1);
        String delivery1=deliveryApp1.delivery();
        logger.debug(delivery1);

    }
}
