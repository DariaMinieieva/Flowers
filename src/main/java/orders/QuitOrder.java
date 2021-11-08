package orders;

import User.User;
import flower_store.FlowerBucket;

public class QuitOrder {
    private FlowerBucket bucky;
    public QuitOrder(FlowerBucket bucky) {
        bucky = bucky;
    }

    public Order createOrder(QuitOrder ordr, User user) {
        Order order = new Order();
        order.addUser(user);
        return order;
    }
}
