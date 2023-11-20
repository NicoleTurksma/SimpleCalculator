// tests/PasswordValidatorTest.java

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PasswordValidatorTest {

    // setup the test Object once
    private PasswordValidator validator = new PasswordValidator();

    @Test
    public void testPasswordIsValid() {
        // All criteria are met
        assertTrue("Password should be valid", validator.validate("P@ssw0rd1"));
    }

    @Test
    public void testPasswordIsTooShort() {
        // Password is too short
        // Assert
        assertFalse("Password should be considered too short", validator.validate("P@ss1"));
    }

    @Test
    public void testPasswordIsTooLong() {
        // Password is too long
        // Assert
        assertFalse("Password should be considered too long", validator.validate("P@ssword1234567890123456"));
    }
    @Test
    public void testPasswordNull() {
        // Assert
        assertFalse("password is null", validator.validate( "null"));
    }

    @Test
    public void testPasswordWithoutLetters() {
        // Assert
        assertFalse( "password needs to contain letters", validator.validate( "@1234567890"));
    }

    @Test
    public void testPasswordWithoutDigits() {
        // Assert
        assertFalse( "password needs to contain digits", validator.validate( "P@ssword"));
    }

    @Test
    public void testPasswordWithoutSpecialCharacters() {
        // Assert
        assertFalse( "password needs to contain characters", validator.validate( "Password1234"));
    }
}