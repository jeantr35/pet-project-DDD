package co.com.sofka.DDD.order.commands;

import co.com.sofka.DDD.order.valueObjects.OrderID;
import co.com.sofka.domain.generic.Command;

public class CreateClientReview implements Command {

    private final OrderID orderID;
    private final Integer review;

    public CreateClientReview(OrderID orderID, Integer review) {
        this.orderID = orderID;
        this.review = review;
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public Integer getReview() {
        return review;
    }
}
