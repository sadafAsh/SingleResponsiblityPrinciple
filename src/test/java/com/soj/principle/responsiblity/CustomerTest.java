package com.soj.principle.responsiblity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {



    @Test
    void testToGetNameOfCustomer() {
        Customer customer=new Customer();
        customer.setName("John");
        Assertions.assertEquals("John",customer.getName());
    }

    @Test
    void testToGetAddressOfCustomer() {
        Customer customer=new Customer();
        customer.setAddress("Pune");
        Assertions.assertEquals("Pune",customer.getAddress());
    }
}