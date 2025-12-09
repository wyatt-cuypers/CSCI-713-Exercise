import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UtilsTest {
    @Test
    void testCheckName() {
        String validName = "Robert";
        assertEquals(Utils.checkName(validName), true);

        String invalidName = null;
        assertEquals(Utils.checkName(invalidName), false);

        String otherInvalidName = "";
        assertEquals(Utils.checkName(otherInvalidName), false);
    }

    @Test
    void testIsValidAge() {
        int validAge = 10;
        assertEquals(Utils.isValidAge(validAge), true);

        int otherValidAge = 0;
        assertEquals(Utils.isValidAge(otherValidAge), true);

        int otherInvalidAge = -10;
        assertEquals(Utils.isValidAge(otherInvalidAge), false);
    }
}
