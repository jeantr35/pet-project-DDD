package co.com.sofka.ddd.domain.order.commands;

import co.com.sofka.ddd.domain.order.value.OrderID;
import co.com.sofka.domain.generic.Command;

public class UpdateStatus extends Command {

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
