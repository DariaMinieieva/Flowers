package orders;

import User.Receiver;
import User.User;
import flower_store.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuitOrderTest<flower> {
    User user = new Receiver();
    private Flower flower;
    private Flower second;

    private FlowerPack pack;
    private FlowerPack second_pack;

    FlowerBucket bucky = new FlowerBucket();
    QuitOrder ordr = new QuitOrder(bucky);
    Order order = ordr.createOrder(ordr, user);

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
    }

    @Test
    void createOrder() {
        assertEquals("Status: Notification!", order.notifyUsers());
    }
}