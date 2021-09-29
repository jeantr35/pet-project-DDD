package co.com.sofka.ddd.domain.order.commands;

import co.com.sofka.ddd.domain.order.value.OrderID;
import co.com.sofka.domain.generic.Command;

public class CreateClientReview extends Command {

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
