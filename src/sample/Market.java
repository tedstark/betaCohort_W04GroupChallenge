package sample;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Market {
    public double priceApples;
    public double priceOranges;
    public double priceBananas;
    public double priceGrapes;
    public int randMin = 1; //cents
    public int randMax = 999; //cents
    public int randUpdateMin = 1;//cents
    public int randUpdateMax = 50;//cents
    public int startPrice=350;

    Random randPrice = new Random();
    DecimalFormat money = new DecimalFormat("0.00");

    public Market() {
        this.priceApples = (randPrice.nextInt(startPrice))/100.0;
        this.priceOranges = (randPrice.nextInt(startPrice))/100.0;
        this.priceBananas = (randPrice.nextInt(startPrice))/100.0;
        this.priceGrapes = (randPrice.nextInt(startPrice))/100.0;

    }

    public double getPriceApples() {
        return priceApples;
    }

    public void setPriceApples(int priceApples) {
        this.priceApples = priceApples;
    }

    public double getPriceOranges() {
        return priceOranges;
    }

    public void setPriceOranges(int priceOranges) {
        this.priceOranges = priceOranges;
    }

    public double getPriceBananas() {
        return priceBananas;
    }

    public void setPriceBananas(int priceBananas) {
        this.priceBananas = priceBananas;
    }

    public double getPriceGrapes() {
        return priceGrapes;
    }

    public void setPriceGrapes(int priceGrapes) {
        this.priceGrapes = priceGrapes;
    }
}
