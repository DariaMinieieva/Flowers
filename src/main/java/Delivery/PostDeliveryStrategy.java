package Delivery;

import flower_store.Item;

import java.util.Arrays;
import java.util.List;

public class PostDeliveryStrategy implements Delivery {

    public String deliver(List<Item> items) {
        return "Delivered via post";
    }
}
