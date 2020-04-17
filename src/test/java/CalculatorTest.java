import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    static Calculator calculator;

    @Test
    public void testAdd(){
        int result = calculator.add(1,4);
        assertEquals(result, 5);
    }

}
