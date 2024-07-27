package boompad;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class artistTest {
    artist artist = new artist("Kanye West","123");

    @Test
    public void setArtist_name() {
        assertNotNull(artist.artist_name);
        artist.setArtist_name("Townes Van Zandt");
        assertEquals(artist.artist_name, "Townes Van Zandt");
    }

    @Test
    public void setArtist_id() {
        assertNotNull(artist.artist_id);
        artist.setArtist_id("456");
        assertEquals(artist.artist_id, "456");
    }

    @Test
    public void getArtist_name() {
        assertNotNull(artist.getArtist_name());
        assertEquals(artist.getArtist_name(),"Kanye West");
    }

    @Test
    public void getArtist_id() {
        assertNotNull(artist.getArtist_id());
        assertEquals(artist.getArtist_id(),"123");
    }

    @Test
    public void testToString() {
        assertEquals(artist.toString(),"Kanye West 123");
    }

}
