import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CartTest {
    private Cart cart = new Cart();

    @DataProvider
    public Object[][] priceDataProvider() {
        return new Object[][]{
                {new BigDecimal(793.6), "ABCDABA"},
                {new BigDecimal(6.0), "CCCCCCC"},
                {new BigDecimal(632.8), "ABCD"},
                {new BigDecimal(135.0), "FFFFFFFFF"}
        };
    }

    @Test(dataProvider = "priceDataProvider")
    public void testCalculate(BigDecimal validPrice, String code) {
        BigDecimal price = cart.calculate(code);
        Assert.assertEquals(validPrice, price);
    }
}