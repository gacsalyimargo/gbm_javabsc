package hu.training360.javase.demos;

import java.math.BigDecimal;

public class PackedProduct extends Product {
    int packingUnit;
    BigDecimal weihtOfBox ;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weihtOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weihtOfBox = weihtOfBox;
    }



    public BigDecimal totalWeight (int prices){
        return BigDecimal.valueOf(prices).multiply(weihtOfBox);
    }

    @Override
    public String toString() {
        return "PackedProduct{" +
                "packingUnit=" + packingUnit +
                ", weihtOfBox=" + weihtOfBox +
                ", name='" + name + '\'' +
                ", unitWeight=" + unitWeight +
                ", numberOfDecimals=" + numberOfDecimals +
                '}';
    }
}
