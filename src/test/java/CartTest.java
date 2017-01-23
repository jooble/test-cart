import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        int price = cart.calculate("ABCDABA");
        Assert.assertEquals(793.6, price);
    }

    @Test
    public void testCalculate1() {
        int price = cart.calculate("CCCCCCC");
        Assert.assertEquals(6.0, price);
    }

    @Test
    public void testCalculate2() {
        int price = cart.calculate("ABCD");
        Assert.assertEquals(632.8, price);
    }

    @Test
    public void testCalculate() {
        int price = cart.calculate("FFFFFFFFF");
        Assert.assertEquals(135.0, price);
    }

}