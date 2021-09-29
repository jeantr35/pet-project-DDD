package co.com.sofka.ddd.domain.order.value;

import co.com.sofka.domain.generic.Identity;

public class ClientID extends Identity {

    public ClientID(){
    }

    private ClientID(String id){
        super(id);
    }

    public static ClientID of(String id){
        return new ClientID(id);
    }
}
