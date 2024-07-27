package boompad;

import org.junit.Test;

import static org.junit.Assert.*;

public class loginTest {
    @Test
    public void verifyTest() {
        assertTrue(login.instance.verify("qwerty", "123456"));
        assertTrue(login.instance.verify("zxcvb", "09876"));
        assertFalse(login.instance.verify("qwer", "1234"));
    }

    @Test
    public void registrationTest(){
        assertFalse(login.instance.registration("zxcvb","09876"));
    }
}