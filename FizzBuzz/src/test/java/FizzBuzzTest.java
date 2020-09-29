import com.fizz.buzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    @Test
    public void oneShouldEqualsOne() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void twoShouldEqualsTwo() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    public void threeShouldEqualsFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void fiveShouldEqualsBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void fifteenShouldEqualsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void thirtyShouldEqualsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }
}
