package co.com.sofka.DDD.order;

import co.com.sofka.DDD.kardex.Voucher;
import co.com.sofka.DDD.order.domainEvents.*;
import co.com.sofka.DDD.order.valueObjects.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Order extends AggregateEvent<OrderID> {

    protected List<Dish> dishList;
    protected Client client;
    protected Billing billing;
    protected TotalValue totalValue;
    protected Status status;

    public Order(OrderID orderId, List<Dish> dishList, Client client, Billing billing) {
        super(orderId);
        appendChange(new OrderCreated(dishList, client, billing)).apply();
    }

    private Order(OrderID orderID){
        super(orderID);
        subscribe(new OrderChange(this));
    }

    public static Order from(OrderID orderID, List<DomainEvent> events){
        var order = new Order(orderID);
        events.forEach(order::applyEvent);
        return order;
    }

    public void createClientReview(Integer value){
        appendChange(new ClientReviewCreated(this.client.identity(), value)).apply();
    }

    public void updateStatus(Status status){
        appendChange(new StatusUpdated(status)).apply();
    }

    public void updateDishPopularity(){
        appendChange(new DishPopularityUpdated()).apply();
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

    public TotalValue getTotalValue() {
        return totalValue;
    }

    public Status getStatus() {
        return status;
    }
}
