package co.com.sofka.ddd.domain.order.value;

import co.com.sofka.domain.generic.ValueObject;

public class DishPopularity implements ValueObject<Integer> {

    private final Integer value;

    public DishPopularity() {
        this.value = 0;
    }

    public DishPopularity(Integer popularity) {
        this.value = popularity;
    }

    public DishPopularity updateDishPopularity() {
        return new DishPopularity(value+1);
    }

    @Override
    public Integer value() {
        return value;
    }
}
