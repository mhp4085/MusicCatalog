package boompad;

import static org.junit.Assert.*;

public class songTest {
    song song1 = new song( "Stronger", "123");
    song song2 = new song( "Baby Love", "456", "The Supremes", "2002", "bc","120","asd", "qwe");

    @org.junit.Test
    public void setSong_artist() {
        assertNotNull(song1.song_artist);
        assertNull(song1.artist);
        assertNotNull(song2.artist);
        song1.setSong_artist("changed");
        assertEquals(song1.song_artist,"changed");
    }

    @org.junit.Test
    public void setSong_id() {
        assertNull(song1.song_id);
        assertNotNull(song2.song_id);
        song1.setSong_id("111");
        assertNotNull(song1.song_id);
        assertEquals(song1.song_id, "111");
    }

    @org.junit.Test
    public void setSong_name() {
        assertNotNull(song1.song_name);
        assertNotNull(song2.song_name);
        song1.setSong_name("changed");
        assertEquals(song1.song_name, "changed");
    }
    @org.junit.Test
    public void setArtist() {
        assertNull(song1.artist);
        assertNotNull(song2.artist);
        artist a = new artist("aa", "aa");
        song1.setArtist(a);
        assertEquals(song1.artist, a);
    }
    @org.junit.Test
    public void setYear() {
        assertNull(song1.song_year);
        assertNotNull(song2.song_year);
        song1.setSong_year("2000");
        assertEquals(song1.song_year, "2000");
    }
    @org.junit.Test
    public void setAlbum() {
        assertNull(song1.song_album);
        assertNotNull(song2.song_album);
        song1.setSong_album("qwer");
        assertEquals(song1.song_album, "qwer");
    }
    @org.junit.Test
    public void setLength() {
        assertNull(song1.song_length);
        assertNotNull(song2.song_length);
        song1.setSong_length("120");
        assertEquals(song1.song_length, "120");
    }
    @org.junit.Test
    public void setProducer() {
        assertNull(song1.song_producer);
        assertNotNull(song2.song_producer);
        song1.setSong_producer("zxcv");
        assertEquals(song1.song_producer, "zxcv");
    }
    @org.junit.Test
    public void setGenre() {
        assertNull(song1.song_genre);
        assertNotNull(song2.song_genre);
        song1.setSong_genre("poi");
        assertEquals(song1.song_genre, "poi");
    }

    @org.junit.Test
    public void getSong_artist() {
        assertNotNull(song1.getSong_artist());
        assertNotNull(song2.getSong_artist());
        assertEquals(song2.getSong_artist(), "The Supremes");
    }

    @org.junit.Test
    public void getSong_id() {
        assertEquals(song1.song_id, null);
        assertEquals(song2.song_id, "456");
        assertNotNull(song2.getSong_id());
    }

    @org.junit.Test
    public void getSong_name() {
        assertNotNull(song1.getSong_name());
        assertNotNull(song2.getSong_name());
        assertEquals(song1.getSong_name(), "Stronger");
        assertEquals(song2.getSong_name(), "Baby Love");
    }

    @org.junit.Test
    public void getArtist() {
        assertNull(song1.getArtist());
        assertNotNull(song2.getArtist());
    }
    @org.junit.Test
    public void getAlbum() {
        assertNotNull(song2.getSong_album());
    }
    @org.junit.Test
    public void getLength() {
        assertNotNull(song2.getSong_length());
    }
    @org.junit.Test
    public void getProducer() {
        assertNotNull(song2.getSong_producer());
    }
    @org.junit.Test
    public void getYear() {
        assertNotNull(song2.getSong_year());
    }
    @org.junit.Test
    public void getGenre() {
        assertNotNull(song2.getSong_genre());
    }


    @org.junit.Test
    public void testToString() {
        assertNotNull(song1.toString());
        assertNotNull(song2.toString());
        assertEquals(song1.toString(), "Stronger 123 null null null");
        assertEquals(song2.toString(),"Baby Love The Supremes bc 2002 qwe");
    }
}
