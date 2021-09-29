package co.com.sofka.DDD.order;

import co.com.sofka.DDD.menu.Offer;
import co.com.sofka.DDD.order.valueObjects.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Dish extends Entity<DishID> {

    private final DishName dishName;
    private Price price;
    private DishPopularity dishPopularity;
    private Offer offer;

    public Dish(DishID entityId, DishName dishName, Price price) {
        super(entityId);
        this.dishName = dishName;
        this.price = price;
    }

    public void updatePrice(Price price){
        this.price = Objects.requireNonNull(price);
    }

    public void calculatePopularity(){
        dishPopularity = dishPopularity.updateDishPopularity();
    }

    public void addOffer(Offer offer){
        this.offer = Objects.requireNonNull(offer);
    }

    public DishName DishName() {
        return dishName;
    }

    public Price Price() {
        return price;
    }
}
