import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CartTest {
    private Cart cart = new Cart();

    @DataProvider
    public Object[][] priceDataProvider() {
        return new Object[][]{
                {793.6, "ABCDABA"},
                {6.0, "CCCCCCC"},
                {632.8, "ABCD"},
                {135.0, "FFFFFFFFF"}
        };
    }

    @Test(dataProvider = "priceDataProvider")
    public void testCalculate(Double validPrice, String code) {
        BigDecimal price = cart.calculate(code);
        Assert.assertEquals(new BigDecimal(validPrice), price);
    }
}