import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void CreateCounter(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void EvaluateOneReturnsOne(){
        String value = fizzBuzz.evaluate(1);
        assertEquals("1",value);
    }
}
