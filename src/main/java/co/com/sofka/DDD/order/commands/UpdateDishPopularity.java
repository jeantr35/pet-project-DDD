package co.com.sofka.DDD.order.commands;

import co.com.sofka.DDD.order.valueObjects.OrderID;
import co.com.sofka.domain.generic.Command;

public class UpdateDishPopularity implements Command {

    private final OrderID orderID;

    public UpdateDishPopularity(OrderID orderID) {
        this.orderID = orderID;
    }

    public OrderID getOrderID() {
        return orderID;
    }
}
