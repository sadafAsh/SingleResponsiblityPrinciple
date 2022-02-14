package com.soj.principle.responsiblity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeliveryApp {
    static final Logger logger = LogManager.getLogger(DeliveryApp.class.getName());
    private Order order;

    public DeliveryApp(Order order) {
        this.order = order;
    }

    public String delivery() {
        logger.debug("Delivery Order");
        return "Order with order id as " +
                this.order.getOrderId() +
                "being delivered to " +
                this.order.getCustomer().getName()
                + '\n' + "Order is to be delivered to " +
                this.order.getCustomer().getAddress();

    }
}
