package co.com.sofka.ddd.domain.order.commands;

import co.com.sofka.ddd.domain.order.value.OrderID;
import co.com.sofka.domain.generic.Command;

public class UpdateDishPopularity extends Command {

    private final OrderID orderID;

    public UpdateDishPopularity(OrderID orderID) {
        this.orderID = orderID;
    }

    public OrderID getOrderID() {
        return orderID;
    }
}
