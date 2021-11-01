package Decorators;

import flower_store.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    private Flower flower;
    private Flower second;

    private FlowerPack pack;
    private FlowerPack second_pack;

    FlowerBucket bucky = new FlowerBucket();


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
    void getPrice() {
        BasketDecorator basketDecorator = new BasketDecorator(bucky);
        assertEquals(basketDecorator.getPrice(), 3204);
    }
}