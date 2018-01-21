package ir.hadi.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    private BigDecimal calculateAll() {
        BigDecimal amount = BigDecimal.ZERO;
        for (Item item : items) {
            BigDecimal individualItemAmount = item.getPrice().multiply(BigDecimal.valueOf(item.getCount()));
            amount = amount.add(individualItemAmount);
        }
        return amount;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateAll());
    }
} 