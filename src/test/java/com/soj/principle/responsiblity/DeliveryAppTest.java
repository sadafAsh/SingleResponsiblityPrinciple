package com.soj.principle.responsiblity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryAppTest {

    @Test
    void testToDeliveryOrder() {
       Order order=new Order();
       Customer customer=new Customer();
       customer.setName("john");
       customer.setAddress("pune");
        DeliveryApp deliveryApp=new DeliveryApp(order);
        order.setCustomer(customer);
        order.setOrderId(order.getOrderId()+new Random().nextInt(500));
        Assertions.assertEquals("Order with order id as " +
                order.getOrderId() +
                "being delivered to " +
                order.getCustomer().getName()
                + '\n' + "Order is to be delivered to " +
                order.getCustomer().getAddress(),deliveryApp.delivery());


    }
}