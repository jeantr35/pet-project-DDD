package co.com.sofka.ddd.domain.order.value;

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
