package co.com.sofka.ddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ddd.domain.order.Order;
import co.com.sofka.ddd.domain.order.commands.CreateOrder;

public class CreateOrderUseCase extends UseCase<RequestCommand<CreateOrder>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateOrder> createOrderRequestCommand) {
        var command = createOrderRequestCommand.getCommand();

        var order = new Order(
                command.getOrderId(),
                command.getDishList(),
                command.getClient(),
                command.getBilling()
        );

        emit().onResponse(new ResponseEvents(order.getUncommittedChanges()));
    }
}
