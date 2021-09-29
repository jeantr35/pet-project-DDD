package co.com.sofka.ddd.domain.order.value;

import co.com.sofka.domain.generic.ValueObject;

public class Address implements ValueObject<String> {

    private final String value;

    public Address(String value){
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
