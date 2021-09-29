package co.com.sofka.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.ddd.domain.order.Client;
import co.com.sofka.ddd.domain.order.Dish;
import co.com.sofka.ddd.domain.order.Order;
import co.com.sofka.ddd.domain.order.value.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.ArrayList;
import java.util.List;

public class CreateOrderUseCase extends UseCase<CreateOrderUseCase.Request, CreateOrderUseCase.Response> {

    private List<Dish> dishList = new ArrayList<>();

    @Override
    public void executeUseCase(Request request) {

        var order = new Order(
                OrderID.of(request.getId()),
                dishList,
                new Client(ClientID.of(request.getId()), new ClientName("Pana"), new Address("A"), new ContactNumber("3219470823")),
                new Billing(request.getBilling())
        );

        List<DomainEvent> eventList = order.getUncommittedChanges();
        emit().onResponse(new Response(eventList));
    }

    public static class Request implements UseCase.RequestValues{

        private final String name;
        private final String id;
        private final Integer billing;

        public Request(String name, String id, Integer billing) {
            this.name = name;
            this.id = id;
            this.billing = billing;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public Integer getBilling() {
            return billing;
        }
    }

    public static class Response implements UseCase.ResponseValues{
        private final List<DomainEvent> eventList;

        public Response(List<DomainEvent> eventList) {
            this.eventList = eventList;
        }

        public List<DomainEvent> getEventList() {
            return eventList;
        }
    }

}
