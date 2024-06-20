package org.example;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.40);
    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.80);
    }


    @Test
    void calculatePriceForMagicOldCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 11, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 1.75);

    }

    @Test
    void calculatePriceForMagicOldCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 12, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.5);

    }

    @Test
    void calculatePriceForMagicOldCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 25, false, "green", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.28);
    }

    @Test
    void calculatePriceForMagicOldCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 32, false, "black", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 8.16);
    }
    
    
    @Test
    void calculatePriceForMagicCards_black_lotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);
    }

    @Test
    void calculatePriceForSpider_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "red", null, "amparo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 11.6);
    }

    @Test
    void calculatePriceForSpider_red_sticky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "red", null, "antonia", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.8);
    }

    @Test
    void calculatePriceForCat() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null, null, "Garfield", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 16.8);
    }

    @Test
    void calculatePriceForDog() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null, null, "Ulises", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 16.8);
    }
    

    @Test
    void calculatePriceForCanary() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(2, null, false, null, null, "Piolin", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 8.4);
    }



    @Test
    void calculatePriceForSpider_gold() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "gold", null, "paco", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 12.6);
    }

    @Test
    void calculatePriceForSpider_gold_sticky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "gold", null, "paca", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.3);
    }

    @Test
    void calculatePriceForSpider_stinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "yellow", null, "julia", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.8);
    }
    
    @Test
    void calculatePriceForFish_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue",  BigDecimal.valueOf(0), "Ana", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 0.1);
    }

    @Test
    void calculatePriceForFish_gold() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "gold",  BigDecimal.valueOf(1), "Norbert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100);
    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }
}