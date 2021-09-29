package co.com.sofka.ddd.domain.order.value;

import co.com.sofka.domain.generic.ValueObject;

public class TotalValue implements ValueObject<Integer> {

    private final Integer price;

    public TotalValue(Integer price) {
        this.price = price;
    }

    @Override
    public Integer value() {
        return price;
    }
}
