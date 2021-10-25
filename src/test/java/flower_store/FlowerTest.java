package flower_store;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private Flower second;
    private Flower third;
    private Flower forth;
    private FlowerPack pack;
    private FlowerPack second_pack;
    private FlowerPack third_pack;
    private FlowerPack forth_pack;
    private FlowerBucket bucky;
    private FlowerBucket bucky_2;
    private Store store;

    String correct = "Flower Flower(price=100.0, sepalLength=0.0, color=null, flowerType=ROSE) was found!\nFlower Flower(price=1234.0, sepalLength=100000.0, color=null, flowerType=ROSE) was found!\n";

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);

        second = new Flower(FlowerType.ROSE);
        second.setPrice(100);

        third = new Flower(FlowerType.TULIP);
        third.setPrice(1000);

        forth = new Flower(FlowerType.ROSE);
        forth.setPrice(1234);
        forth.setSepalLength(100000);

        pack = new FlowerPack(flower, 20);
        second_pack = new FlowerPack(second, 30);
        third_pack = new FlowerPack(third, 45);
        forth_pack = new FlowerPack(forth, 12);

        bucky = new FlowerBucket();
        bucky.setFlowerPack(pack);
        bucky.setFlowerPack(second_pack);

        bucky_2 = new FlowerBucket();
        bucky_2.setFlowerPack(third_pack);
        bucky_2.setFlowerPack(forth_pack);

        store = new Store();
        store.setFlowerBucket(bucky);
        store.setFlowerBucket(bucky_2);

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
        assertEquals(3200, bucky.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerStoreFlower() {
        assertEquals(correct, store.search(FlowerType.ROSE));
    }
}