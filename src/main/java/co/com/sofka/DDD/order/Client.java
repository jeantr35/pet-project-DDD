package co.com.sofka.DDD.order;

import co.com.sofka.DDD.order.valueObjects.*;
import co.com.sofka.domain.generic.Entity;

import java.util.List;
import java.util.Objects;

public class Client extends Entity<ClientID> {

    private ClientName clientName;
    private final Address address;
    private ContactNumber contactNumber;
    private List<Review> reviews;


    public Client(ClientID entityId, ClientName clientName, Address address, ContactNumber contactNumber) {
        super(entityId);
        this.clientName = clientName;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public void updateContactNumber(ContactNumber contactNumber){
        this.contactNumber = Objects.requireNonNull(contactNumber);
    }

    public void updateClientName(ClientName clientName){
        this.clientName = Objects.requireNonNull(clientName);
    }

    public void createReview(Integer value){
        reviews.add(new Review(value));
    }

    public ClientName getClientName() {
        return clientName;
    }

    public Address getAddress() {
        return address;
    }

    public ContactNumber getContactNumber() {
        return contactNumber;
    }
}
