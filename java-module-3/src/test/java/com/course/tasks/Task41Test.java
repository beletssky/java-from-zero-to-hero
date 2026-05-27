package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task41Test {

    @Test
    void addThenTotalEqualsExpected() {
        Task41 cart = new Task41();
        cart.add(new Task41.Item("Bread", 1500L, 2));
        cart.add(new Task41.Item("Milk", 2500L, 1));
        assertEquals(5500L, cart.total());
    }

    @Test
    void emptyCartTotalIsZero() {
        Task41 cart = new Task41();
        assertEquals(0L, cart.total());
    }

    @Test
    void getItemsLengthReflectsAdds() {
        Task41 cart = new Task41();
        assertEquals(0, cart.getItems().length);
        cart.add(new Task41.Item("Apple", 800L, 3));
        cart.add(new Task41.Item("Pear", 900L, 2));
        assertEquals(2, cart.getItems().length);
    }

    @Test
    void removeReducesTotalAndCount() {
        Task41 cart = new Task41();
        cart.add(new Task41.Item("Bread", 1500L, 2));
        cart.add(new Task41.Item("Milk", 2500L, 1));
        cart.remove("Bread");
        assertEquals(1, cart.getItems().length);
        assertEquals(2500L, cart.total());
    }

    @Test
    void removeMissingNameIsNoOp() {
        Task41 cart = new Task41();
        cart.add(new Task41.Item("Bread", 1500L, 2));
        cart.remove("Cheese");
        assertEquals(1, cart.getItems().length);
        assertEquals(3000L, cart.total());
    }

    @Test
    void removeOnlyFirstMatch() {
        Task41 cart = new Task41();
        cart.add(new Task41.Item("Bread", 1500L, 1));
        cart.add(new Task41.Item("Bread", 1500L, 1));
        cart.remove("Bread");
        assertEquals(1, cart.getItems().length);
    }

    @Test
    void getItemsReturnsCopy() {
        Task41 cart = new Task41();
        cart.add(new Task41.Item("Bread", 1500L, 2));
        Task41.Item[] first = cart.getItems();
        first[0] = null;
        assertNotNull(cart.getItems()[0]);
    }

    @Test
    void itemGettersAndEquals() {
        Task41.Item a = new Task41.Item("Bread", 1500L, 2);
        Task41.Item b = new Task41.Item("Bread", 1500L, 2);
        assertEquals("Bread", a.getName());
        assertEquals(1500L, a.getPriceKopecks());
        assertEquals(2, a.getQty());
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void itemToStringNotNull() {
        Task41.Item a = new Task41.Item("Bread", 1500L, 2);
        assertNotNull(a.toString());
    }

    @Test
    void cartToStringHasPrefix() {
        Task41 cart = new Task41();
        assertTrue(cart.toString().startsWith("ShoppingCart"));
    }

    @Test
    void cartEqualsAndHashCode() {
        Task41 c1 = new Task41();
        Task41 c2 = new Task41();
        c1.add(new Task41.Item("Bread", 1500L, 2));
        c2.add(new Task41.Item("Bread", 1500L, 2));
        assertEquals(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());
    }
}
