import static org.junit.Assert.assertEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RomanNumberTest {

    private RomanNumber romanNumber = new RomanNumber();

    @Test
    @Parameters({"I, 1", "II, 2", "III, 3", "IV, 4", "V, 5", "VI, 6", "VII, 7", "VIII, 8", "IX, 9", "X, 10", "XI, 11",
            "XII, 12", "XIII, 13"})
    public void givenI_then_return1(String roman, int expected) {
        assertEquals(expected, romanNumber.parse(roman));
    }

}
