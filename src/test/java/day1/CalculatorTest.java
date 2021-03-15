package day1;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @RepeatedTest(10)  //automated the method multiplyTwoNumbers to be run 10 times
    public void multiplyTwoNumbers()
    {
        assertEquals(calculator.multiply(3,5),15);
    }

    @Test //multiple assertions in a method
    public void multipleAssertions()
    {
        assertEquals(calculator.multiply(2,5),10);
        assertEquals(calculator.multiply(5,1),5);
    }

    @Test // grouping multiple asserts
    public void groupingAsserts()
    {
        assertAll
                (
                () -> assertEquals(calculator.multiply(9,4),36),
                () -> assertEquals(calculator.multiply(3,1),3)
                );
    }

    @Test //enforcing exception when multiplying with zero
    public void multiplyWithZero()
    {
        int result = calculator.multiply(0,5);
        try
        {
            if(result==0)
            {
                throw new Exception("Multiplying with zero");
            }
        }
        catch (Exception e)
        {
            assertEquals(result,0);
        }
    }
}