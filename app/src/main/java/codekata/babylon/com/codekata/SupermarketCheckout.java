package codekata.babylon.com.codekata;

import java.util.HashMap;
import java.util.Map;

public class SupermarketCheckout implements Checkout {

    private Map<Character, Integer> shoppingBasket, itemPrices;

    public SupermarketCheckout() {
        shoppingBasket = new HashMap<>();
        itemPrices = new HashMap<>();
        initItemPrices();
    }

    private void initItemPrices() {
        itemPrices.clear();
        itemPrices.put('A', 50);
        itemPrices.put('B', 30);
        itemPrices.put('C', 20);
        itemPrices.put('D', 15);
    }

    @Override
    public void scan(char item) {
        int counter = 1;
        if (shoppingBasket.containsKey(item)) {
            counter = shoppingBasket.get(item) + 1;
        }
        shoppingBasket.put(item, counter);
    }

    @Override
    public int total() {
        return countTotalPrice(shoppingBasket);
    }

    private int countTotalPrice(Map<Character, Integer> shoppingBasket) {
        int totalPrice = 0;

        for (Object object : shoppingBasket.entrySet()) {
            Map.Entry pair = (Map.Entry) object;
            char item = (char) pair.getKey();
            int itemCount = (int) pair.getValue();

            // to how many pairs of items of 3 or 2 (depending on the item)
            // using modulus operator to get the discounted item count
            // add it to the total price plus the remaining item count (of items that are not discounted)

            totalPrice = totalPrice + getItemPrice(item) * itemCount;
        }

        return totalPrice;
    }

    private int getItemPrice(char item) {
        return itemPrices.get(item);
    }

}
