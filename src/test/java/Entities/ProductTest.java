package Entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    private Product testProduct;

    @Before
    public void setUp()
    {
        testProduct = new Product();
        testProduct.setProductName("Soap");

    }


    @Test
    public void getProductId() {
        assertEquals(testProduct.getProductId(), 0);
    }

    @Test
    public void getProductName() {
        assertTrue(testProduct.getProductName().equals("Soap"));
    }

    @Test
    public void setProductName() {
        testProduct.setProductName("New Name");
        assertTrue(testProduct.getProductName().equals("New Name"));
    }
}