package flower_store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public void setFlowerBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public String search(FlowerType flower) {
        String res = "";
        for (int i = 0; i < flowerBuckets.size(); ++i) {
            List<Flower> temp = flowerBuckets.get(i).getFlowerTypesBuck();
            for (int j = 0; j < temp.size(); ++j) {
                if (temp.get(j).getFlowerType() == flower) {
                    res += String.format("Flower " + temp.get(j) + " was found!\n");
                }
            }
        }
        return res;
    }
}
