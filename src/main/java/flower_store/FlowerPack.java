package flower_store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public FlowerPack(Flower flower, int amount) {
        this.setFlower(flower);
        this.setAmount(amount);
    }
}
