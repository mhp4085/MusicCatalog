package boompad;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class userTest {
    user user1 = new user();
    user user2 = new user("zhaowen", "chenz137", "user");

    @Test
    public void setUser_name() {
        assertNull(user1.user_name);
        user1.setUser_name("abc");
        assertNotNull(user1.user_name);
        assertEquals(user1.user_name, "abc");
        user2.setUser_name("qwer");
        assertEquals(user2.user_name, "qwer");
    }

    @Test
    public void setUser_id() {
        assertNull(user1.user_password);
        user1.setUser_id("123");
        assertNotNull(user1.user_password);
        assertEquals(user1.user_password, "123");
        user2.setUser_id("456");
        assertEquals(user2.user_password, "456");
    }

    @Test
    public void setUser_type() {
        assertNotNull(user1.user_type);
        assertEquals(user1.user_type,"user");
        assertNotNull(user2.user_type);
        assertEquals(user2.user_type,"user");
    }

    @Test
    public void getUser_name() {
        assertNull(user1.getUser_name());
        assertEquals(user2.getUser_name(), "zhaowen");
    }

    @Test
    public void getUser_id() {
        assertNull(user1.getUser_id());
        assertEquals(user2.getUser_id(), "chenz137");
    }

    @Test
    public void getUser_type() {
        assertNotNull(user1.getUser_type());
        assertEquals(user1.getUser_type(), "user");
        assertEquals(user2.getUser_type(), "user");
    }

    @Test
    public void testToString() {
        assertEquals(user1.toString(),"null (user)");
        assertEquals(user2.toString(),"zhaowen (user)");
    }
}
