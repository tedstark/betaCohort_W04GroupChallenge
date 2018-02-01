package sample;

import java.util.Random;

public class Market {
    public int priceApples;
    public int priceOranges;
    public int priceBananas;
    public int priceGrapes;
    public int minPrice;
    public int maxPrice;
    public int minSwing;
    public int maxSwing;
    public int startPrice;

    public Market(int priceApples, int priceOranges, int priceBananas, int priceGrapes) {
        this.priceApples = priceApples;
        this.priceOranges = priceOranges;
        this.priceBananas = priceBananas;
        this.priceGrapes = priceGrapes;
    }

    public int getPriceApples() {
        return priceApples;
    }

    public void setPriceApples(int priceApples) {
        this.priceApples = priceApples;
    }

    public int getPriceOranges() {
        return priceOranges;
    }

    public void setPriceOranges(int priceOranges) {
        this.priceOranges = priceOranges;
    }

    public int getPriceBananas() {
        return priceBananas;
    }

    public void setPriceBananas(int priceBananas) {
        this.priceBananas = priceBananas;
    }

    public int getPriceGrapes() {
        return priceGrapes;
    }

    public void setPriceGrapes(int priceGrapes) {
        this.priceGrapes = priceGrapes;
    }

    Random randPrice = new Random();

//    public int priceRoll() {
//        maxPrice=999;
//        minPrice=1;
//        maxSwing=50;
//        minSwing=1;
//        price = randPrice.nextInt((maxPrice)+ minPrice);
//        return price;
//    }

}
