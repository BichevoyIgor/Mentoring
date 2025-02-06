import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import week2_education_tasks.methods.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void addIntLongTest(){
        Assert.assertEquals(4L, calculator.add(2, 2L));
    }

    @Test
    public void addIntIntTest(){
        Assert.assertEquals(6, calculator.add(3, 3));
    }

    @Test
    public void addLongLongTest(){
        Assert.assertEquals(10L, calculator.add(5L, 5L));
    }


}
