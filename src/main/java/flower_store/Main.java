package flower_store;

import static flower_store.FlowerType.TULIP;

public class Main {
    public static void main(String[] args) {
//        Flower[] flowers = new Flower[3];
//        int[] color = {127, 0, 0};
//        for (int i=0; i < flowers.length; i++) {
//            flowers[i] = new Flower(TULIP);
//            flowers[i].setColor(color);
//
//        }
//
//        color[1] = 127;
//
//        for (int i=0; i < flowers.length; i++) {
//            System.out.println(flowers[i]);
//        }

        Flower flower;
        Flower second;
        Flower third;
        Flower forth;
        FlowerPack pack;
        FlowerPack second_pack;
        FlowerPack third_pack;
        FlowerPack forth_pack;
        FlowerBucket bucky;
        FlowerBucket bucky_2;
        Store store;


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

        System.out.println(store.search(FlowerType.ROSE));

    }
}
