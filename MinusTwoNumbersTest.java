package minustwonumbers;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MinusTwoNumbersTest {

    private static Calculation C1;

    public MinusTwoNumbersTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        C1 = new Calculation(-1, 8);
    }

    @Test //проверка введенных чисел на null
    public void Numbers_NO_NULL() {

        float expected = C1.number1;
        float expected2 = C1.number2;
        Assert.assertNotNull(expected);
        Assert.assertNotNull(expected2);

    }

    @Test //тест на правильность выслений (число 1 - число 2)
    public void Num1MinusNum2Test() {
        float expected = C1.number1 - C1.number2;
        float actual = C1.razn1;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test //тест на правильность выслений (число 2 - число 1)
    public void Num2MinusNum1Test() {
        float expected = C1.number2 - C1.number1;
        float actual = C1.razn2;
        Assert.assertEquals(expected, actual, 0.01);
    }

}
