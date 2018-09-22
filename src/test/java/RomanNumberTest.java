import static org.junit.Assert.assertEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RomanNumberTest {

    private RomanNumber romanNumber = new RomanNumber();

    @Test
    @Parameters({"I, 1", "II, 2", "III, 3", "IV, 4", "V, 5", "VI, 6"})
    public void givenI_then_return1(String roman, int expected) {
        assertEquals(expected, romanNumber.parse(roman));
    }

}
