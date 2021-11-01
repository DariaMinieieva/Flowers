package Delivery;

import flower_store.Item;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    PostDeliveryStrategy strategy = new PostDeliveryStrategy();
    List<Item> items= new ArrayList<Item>();

    @Test
    void deliver() {
        assertEquals(strategy.deliver(items), "Delivered via post");
    }
}