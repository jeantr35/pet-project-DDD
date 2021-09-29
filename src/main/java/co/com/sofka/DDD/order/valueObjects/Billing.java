package co.com.sofka.DDD.order.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Billing implements ValueObject<Integer> {

    private final Integer value;

    public Billing(Integer value){
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
