package com.soj.principle.responsiblity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BillCalculationTest {

    @Test
    void TestToCalculateBillOfCustomer() {
        Order order=new Order();
BillCalculation billCalculation=new BillCalculation(order);
order.setItemPrice(200);
order.setQuantity(2);
order.setTotalBillAmt(billCalculation.calculateTotalAmt());
order.setOrderId(order.getOrderId()+new Random().nextInt(500));
        Assertions.assertEquals("Order with order id " +
                order.getOrderId() +
                "has a total bill amount of " +
                order.getTotalBillAmt(),billCalculation.calculateBill());

    }

    @Test
    void testToCalculateTotalAmt(){
        Order order=new Order();
        BillCalculation billCalculation=new BillCalculation(order);
        order.setItemPrice(200);
        order.setQuantity(2);
        order.setTotalBillAmt(billCalculation.calculateTotalAmt());
        Assertions.assertEquals(400,billCalculation.calculateTotalAmt());

    }
}