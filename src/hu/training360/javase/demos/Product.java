package hu.training360.javase.demos;

import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal unitWeight;
    int numberOfDecimals;
    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeight) {
        this.name = name;
        this.unitWeight = unitWeight;
    }
    public BigDecimal totalWeight(int pieces){
        return BigDecimal.valueOf(pieces).multiply(unitWeight);

    }
}
