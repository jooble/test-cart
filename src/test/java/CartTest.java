
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CartTest {
    private Cart cart;

    @Before
    public void initData() {
        cart = new Cart();
    }

    @After
    public void clearData() {
        cart = null;
    }

    @Test
    public void testCalculate() {
        BigDecimal price = cart.calculate("ABCDABA");
        Assert.assertEquals(new BigDecimal(793.6), price);
    }

    @Test
    public void testCalculate1() {
        BigDecimal price = cart.calculate("CCCCCCC");
        Assert.assertEquals(new BigDecimal(6.0), price);
    }

    @Test
    public void testCalculate2() {
        BigDecimal price = cart.calculate("ABCD");
        Assert.assertEquals(new BigDecimal(632.8), price);
    }

    @Test
    public void testCalculate3() {
        BigDecimal price = cart.calculate("FFFFFFFFF");
        Assert.assertEquals(new BigDecimal(135.0), price);
    }

}