package flower_store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FlowerBucket extends Item {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    List<Flower> flowerTypesBuck = new ArrayList<Flower>();

    public void setFlowerPack(FlowerPack pack) {
        flowerPacks.add(pack);
        flowerTypesBuck.add(pack.getFlower());
    }


    public double getPrice(){
        double res = 0.0;

        for (int i=0; i<flowerPacks.size(); i++) {
            res += flowerPacks.get(i).getPrice();
        }
        return res;
    }

    @Override
    public String getDescription() {
        return "Bucket";
    }
}
