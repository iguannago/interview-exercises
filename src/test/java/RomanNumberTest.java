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
            "XII, 12", "XIII, 13", "XIV, 14", "XV, 15", "XVI, 16", "XVII, 17", "XVIII, 18", "XIX, 19", "XX, 20",
            "XXI, 21", "XXII, 22", "XXIII, 23", "XXIV, 24", "XXXIV, 34", "XXXIX, 39", "L, 50", "XL, 40", "XLI, 41",
            "XLII, 42", "XLIII, 43", "XLV, 45", "XLIV, 44", "XLVI, 46", "XLVII, 47", "XLIX, 49", "LI, 51",
            "LXXVIII, 78", "LXXXVIII, 88", "LXXV, 75"})
    public void givenI_then_return1(String roman, int expected) {
        assertEquals(expected, romanNumber.parse(roman));
    }

}
