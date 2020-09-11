package hu.training360.javase.demos;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PackedProduct packedProduct = new PackedProduct("Sör",BigDecimal.valueOf(50),12,600,BigDecimal.valueOf(10));
        System.out.println(packedProduct);
    }
}

