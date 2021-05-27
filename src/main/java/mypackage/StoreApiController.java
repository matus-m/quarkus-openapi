package mypackage;


import gen.apis.petstore.Order;
import gen.apis.petstore.StoreApi;

import javax.enterprise.context.RequestScoped;
import java.util.Map;

@RequestScoped
public class StoreApiController implements StoreApi {

    @Override
    public void deleteOrder(Long orderId) {
        //TODO implement me
    }

    @Override
    public Map<String, Integer> getInventory() {
        //TODO implement me
        return null;
    }

    @Override
    public Order getOrderById(Long orderId) {
        //TODO implement me
        return null;
    }

    @Override
    public Order placeOrder(Order body) {
        //TODO implement me
        return null;
    }
}