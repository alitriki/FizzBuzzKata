import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void CreateCounter(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void EvaluateOneReturnsOne(){
        String value = fizzBuzz.evaluate(1);
        assertEquals("1",value);
    }

    @Test
    public void EvaluateTwoReturnsTwo(){
        String value = fizzBuzz.evaluate(2);
        assertEquals("2",value);
    }

    @Test
    public void EvaluateTreeReturnsFizz(){
        String value = fizzBuzz.evaluate(3);
        assertEquals("Fizz",value);
    }

    @Test
    public void EvaluateFiveReturnsBuzz(){
        String value = fizzBuzz.evaluate(5);
        assertEquals("Buzz",value);
    }

    @Test
    public void EvaluateSixReturnsFizz(){
        String value = fizzBuzz.evaluate(6);
        assertEquals("Fizz",value);
    }

}
