package co.com.sofka.DDD.order.commands;

import co.com.sofka.DDD.order.Client;
import co.com.sofka.DDD.order.Dish;
import co.com.sofka.DDD.order.valueObjects.Billing;
import co.com.sofka.DDD.order.valueObjects.OrderID;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class CreateOrder implements Command {

    private final OrderID orderId;
    private final List<Dish> dishList;
    private final Client client;
    private final Billing billing;

    public CreateOrder(OrderID orderId, List<Dish> dishList, Client client, Billing billing) {
        this.orderId = orderId;
        this.dishList = dishList;
        this.client = client;
        this.billing = billing;
    }

    public OrderID getOrderId() {
        return orderId;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public Client getClient() {
        return client;
    }

    public Billing getBilling() {
        return billing;
    }
}
