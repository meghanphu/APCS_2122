import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        // call your assertEquals and assertNotEquals methods here
        assertEquals(RomanToDecimal.romanToDecimal("XI"), 11);
        assertEquals(RomanToDecimal.romanToDecimal("IXIX"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("XCXL"), 130);
        assertEquals(RomanToDecimal.romanToDecimal("IVIVIV"), 16);
        assertEquals(RomanToDecimal.romanToDecimal("MC"), 1100);
        assertEquals(RomanToDecimal.romanToDecimal("CXL"), 140);
        assertEquals(RomanToDecimal.romanToDecimal("CMXCV"), 995);
        assertEquals(RomanToDecimal.romanToDecimal("LIX"), 59);
        assertEquals(RomanToDecimal.romanToDecimal("CDXV"), 415);
        assertEquals(RomanToDecimal.romanToDecimal("CI"), 101);
        // logically incorect
        assertEquals(RomanToDecimal.romanToDecimal("XIXIXI"), 31);
        assertEquals(RomanToDecimal.romanToDecimal("IMMCM"), 2901);
        assertEquals(RomanToDecimal.romanToDecimal("VXIX"), 24);
        assertEquals(RomanToDecimal.romanToDecimal("VVIXM"), 1019);
        assertEquals(RomanToDecimal.romanToDecimal("IIIVI"), 7);
        // 4 invalid
        assertEquals(RomanToDecimal.romanToDecimal("your mom"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("ILOVEURMOM"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("hello"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("YIKES"), -1);
        // assertNotEquals
        assertNotEquals(RomanToDecimal.romanToDecimal("YMCA"), 20);
        assertNotEquals(RomanToDecimal.romanToDecimal("Joe mama"), 20);

    }
}