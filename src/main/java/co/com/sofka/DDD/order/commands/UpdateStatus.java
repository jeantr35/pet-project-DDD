package co.com.sofka.DDD.order.commands;

import co.com.sofka.DDD.order.valueObjects.OrderID;
import co.com.sofka.domain.generic.Command;

public class UpdateStatus implements Command {

    private final OrderID orderID;
    private final String status;

    public UpdateStatus(OrderID orderID, String status) {
        this.orderID = orderID;
        this.status = status;
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public String getStatus() {
        return status;
    }
}
