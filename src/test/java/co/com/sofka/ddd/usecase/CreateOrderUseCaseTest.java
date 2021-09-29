package co.com.sofka.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ddd.domain.order.Client;
import co.com.sofka.ddd.domain.order.Dish;
import co.com.sofka.ddd.domain.order.commands.CreateOrder;
import co.com.sofka.ddd.domain.order.domainevents.OrderCreated;
import co.com.sofka.ddd.domain.order.value.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateOrderUseCaseTest {

    @Test
    void createOrderWithAllValuesTest(){
        //arrange
        List<Dish> dishList = new ArrayList<>();
        Client client = new Client(new ClientID("xxxxx"), new ClientName("Jean"), new Address("A"),
                new ContactNumber("3219470823"));


        var command = new CreateOrder(
                OrderID.of("xxxxxx"),
                dishList,
                client,
                new Billing(50000)
        );

        var useCase = new CreateOrderUseCase();

        //act
        var events = UseCaseHandler.getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow().
                getDomainEvents();

        //assert
        var event = (OrderCreated) events.get(0);
        Assertions.assertEquals(50000, event.getBilling().value());
        Assertions.assertEquals("Jean", event.getClient().getClientName().value());
        Assertions.assertEquals("A", event.getClient().getAddress().value());
        Assertions.assertEquals("3219470823", event.getClient().getContactNumber().value());
    }

}