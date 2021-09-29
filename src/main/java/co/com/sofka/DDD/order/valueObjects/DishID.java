package co.com.sofka.DDD.order.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class DishID extends Identity {

    public DishID(){
    }

    private DishID(String id){
        super(id);
    }

    public static DishID of(String id){
        return new DishID(id);
    }

}
