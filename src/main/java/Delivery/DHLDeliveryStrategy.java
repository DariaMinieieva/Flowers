package Delivery;

import flower_store.Item;

import java.util.Arrays;
import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    public String deliver(List<Item> items) {
        return "Delivered with DHL";
    }
}
