package Decorators;

import flower_store.Item;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }
    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }
}
