package co.com.sofka.ddd.domain.order.value;

import co.com.sofka.domain.generic.ValueObject;

public class ClientName implements ValueObject<String> {

    private final String value;

    public ClientName(String value){
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
