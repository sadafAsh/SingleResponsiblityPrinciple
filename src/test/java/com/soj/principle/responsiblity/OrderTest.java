package com.soj.principle.responsiblity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testToGetItemPrice() {
        Order order=new Order();
        order.setItemPrice(200);
        Assertions.assertEquals(200,order.getItemPrice());
    }

    @Test
    void testToGetCustomer() {
        Customer customer=new Customer();
        Order order=new Order();
        order.setCustomer(customer);
        Assertions.assertEquals(customer,order.getCustomer());
    }


    @Test
    void testToGetItemName() {
        Order order=new Order();
        order.setItemName("pizza");
        Assertions.assertEquals("pizza",order.getItemName());
    }

    @Test
    void testToGetQuantity() {
        Order order=new Order();
        order.setQuantity(2);
        Assertions.assertEquals(2,order.getQuantity());

    }
    @Test
    void testToPrepareOrder(){
        Order order=new Order();
        Customer customer=new Customer();
        customer.setName("john");
        order.setItemName("pizza");
        order.setCustomer(customer);
        Assertions.assertEquals("Preparing order for customer - " +
                   order. getCustomer().getName() + "" +
                    "who has ordered " +order.getItemName(),order.prepareOrder());



    }
}