package co.com.sofka.ddd.domain.order.value;

import co.com.sofka.domain.generic.ValueObject;

public class DishName implements ValueObject<String> {

    private final String value;

    public DishName(String value){
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
