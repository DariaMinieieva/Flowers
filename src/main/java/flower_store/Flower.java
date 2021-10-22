package flower_store;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class Flower {
    private double price;
    private double sepalLength;
    private int[] color;
    // rgb -128 127
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flower) {
        this.flowerType = flower;
    }


}
