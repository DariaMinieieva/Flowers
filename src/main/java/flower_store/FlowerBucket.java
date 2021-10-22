package flower_store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void setFlowerPack(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double getPrice(){
        double res = 0.0;

        for (int i=0; i<flowerPacks.size(); i++) {
            res += flowerPacks.get(i).getPrice();
        }
        return res;
    }
}
