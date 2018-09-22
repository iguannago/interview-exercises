import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumberTest {

    private RomanNumber romanNumber = new RomanNumber();

    @Test
    public void givenI_then_return1() {
        assertEquals("Roman parsed 1 is incorrect", 1, romanNumber.parse("I"));
    }

    @Test
    public void givenII_then_return2() {
        assertEquals(2, romanNumber.parse("II"));
    }

    @Test
    public void givenIII_then_return3() {
        assertEquals(3, romanNumber.parse("III"));
    }

    @Test
    public void givenIV_then_return4() {
        assertEquals(4, romanNumber.parse("IV"));
    }

    @Test
    public void givenV_then_return5() {
        assertEquals(5, romanNumber.parse("V"));
    }
}
