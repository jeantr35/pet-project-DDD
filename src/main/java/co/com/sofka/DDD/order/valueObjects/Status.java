package co.com.sofka.DDD.order.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Status implements ValueObject<String> {

    private final String status;

    public Status(String status) {
        this.status = status;
    }

    @Override
    public String value() {
        return status;
    }
}
