package co.com.sofka.ddd.domain.order.value;

import co.com.sofka.domain.generic.Identity;

public class OrderID extends Identity {

    public OrderID(){
    }

    private OrderID(String id){
        super(id);
    }

    public static OrderID of(String id){
        return new OrderID(id);
    }

}
