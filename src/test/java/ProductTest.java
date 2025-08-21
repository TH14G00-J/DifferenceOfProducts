import entities.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    void testDifferencePositiveNumbers() {
        Product product = new Product();
        assertEquals(17, product.getDifferenceBetweenProducts(7,5,3,6));
    }

    @Test
    void testDifferenceWithZero() {
        Product product = new Product();
        assertEquals(25, product.getDifferenceBetweenProducts(5, 5, 0, 5));
    }

    @Test
    void testDifferenceNegativeNumbers() {
        Product product = new Product();
        assertEquals(-7, product.getDifferenceBetweenProducts(-3,5,2,-4));
    }
}