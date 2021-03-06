package co.com.sofka.DDD.order;

import co.com.sofka.DDD.kardex.valueObjects.TotalPrice;
import co.com.sofka.DDD.order.domainEvents.*;
import co.com.sofka.DDD.order.valueObjects.TotalValue;
import co.com.sofka.domain.generic.EventChange;

import java.util.List;

public class OrderChange extends EventChange {

    public TotalValue calculateTotalValue(List<Dish> dishList){
        Integer price = 0;
        for (Dish dish: dishList) {
            price += dish.Price().value();
        }

        return new TotalValue(price);
    }

    public OrderChange(Order order){

        apply((OrderCreated event) -> {
            order.client = event.getClient();
            order.dishList = event.getDishList();
            order.billing = event.getBilling();
            order.totalValue = calculateTotalValue(event.getDishList());
        });

        apply((StatusUpdated event) -> {
            order.status = event.getStatus();
        });

        apply((DishPopularityUpdated event) -> {
            for (Dish dish: order.dishList) {
                dish.calculatePopularity();
            }
        });

        apply((ClientReviewCreated event) ->{
            order.client.createReview(event.getValue());
        });

    }

}
