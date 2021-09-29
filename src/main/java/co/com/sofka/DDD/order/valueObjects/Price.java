package co.com.sofka.DDD.order.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Price implements ValueObject<Integer> {

    private final Integer value;

    public Price(Integer value){
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
