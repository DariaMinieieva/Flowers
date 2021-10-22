package flower_store;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private FlowerPack pack;
    private FlowerBucket bucky;
    private Flower second;
    private FlowerPack second_pack;

    @org.junit.jupiter.api.BeforeEach
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

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerPackPrice() {
        assertEquals(200, pack.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @org.junit.jupiter.api.Test
    void getFlowerBucketPrice() {
        assertEquals(3210, bucky.getPrice());
    }
}