package boompad;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class sortByTest {
    List<song> songs = new ArrayList<song>();
    song s = new song("Stronger", "500", "bb", "2001", "aaa", "60","qwe","fd");
    song s2 = new song("Baby Love", "323", "cc", "1998", "ccc","120","zxc","fer");
    song s3 = new song("Pancho and Lefty", "123", "aa", "2003", "bbb","200","tr","erw");

    @Test
    public void byArtist() {
        songs.add(s);
        songs.add(s2);
        songs.add(s3);
        sortBy.byArtist(songs);
        List<song> song = new ArrayList<song>();
        song.add(s3);
        song.add(s);
        song.add(s2);
        assertEquals(songs,song);
    }

    @Test
    public void byName() {
        songs.add(s);
        songs.add(s2);
        songs.add(s3);
        sortBy.byName(songs);
        List<song> song = new ArrayList<song>();
        song.add(s2);
        song.add(s3);
        song.add(s);
        assertEquals(songs,song);
    }

    @Test
    public void byYear() {
        songs.add(s);
        songs.add(s2);
        songs.add(s3);
        sortBy.byYear(songs);
        List<song> song = new ArrayList<song>();
        song.add(s2);
        song.add(s);
        song.add(s3);
        assertEquals(songs,song);
    }

    @Test
    public void byYearBack() {
        songs.add(s);
        songs.add(s2);
        songs.add(s3);
        sortBy.byYearBack(songs);
        List<song> song = new ArrayList<song>();
        song.add(s3);
        song.add(s);
        song.add(s2);
        assertEquals(songs,song);
    }

    @Test
    public void byAlbum() {
        songs.add(s);
        songs.add(s2);
        songs.add(s3);
        sortBy.byAlbum(songs);
        List<song> song = new ArrayList<song>();
        song.add(s);
        song.add(s3);
        song.add(s2);
        assertEquals(songs,song);
    }
}
