package orders;

import User.Receiver;
import User.User;
import flower_store.Flower;
import flower_store.FlowerBucket;
import flower_store.FlowerPack;
import flower_store.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    User user = new Receiver();
    User user_2 = new Receiver();
    private Flower flower;
    private Flower second;

    private FlowerPack pack;
    private FlowerPack second_pack;

    FlowerBucket bucky = new FlowerBucket();
    Order order = new Order();


    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);

        second = new Flower(FlowerType.ROSE);
        second.setPrice(100);

        pack = new FlowerPack(flower, 20);
        second_pack = new FlowerPack(second, 30);

        bucky = new FlowerBucket();
        bucky.setFlowerPack(pack);
        bucky.setFlowerPack(second_pack);
        order.addUser(user);
        order.addUser(user_2);
    }

    @Test
    void orderId() {
        assertEquals(2, order.getID());
        order.removeUser(user_2);
        assertEquals(1, order.getID());
    }
}