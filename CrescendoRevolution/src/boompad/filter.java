/**
 * @author Crescendo Revolution Team
 * 
 * boompad.filter class includes the information on filtering music data
 */


package boompad;

import java.util.List;
import java.util.ArrayList;

public class filter {
	
	 // ============================================================ Methods
	 /**
     * Method filters by artist
     * 
     * @param songs an ArrayList of song information
     * @param keyword a String which is the filtered artist
     */
	public static ArrayList<song> filterByArtist(ArrayList<song> songs, String keyword) {
		ArrayList<song> filtered = new ArrayList<song>();
		for (song s : songs) {
			if (s.song_artist.toUpperCase().equals(keyword.toUpperCase()))
				filtered.add(s);
		}
		return filtered;
	}
	
	 /**
     * Method filters by album
     * 
     * @param songs an ArrayList of song information
     * @param keyword a String which is the filtered album
     */
	public static ArrayList<song> filterByAlbum(ArrayList<song> songs, String keyword) {
		ArrayList<song> filtered = new ArrayList<song>();
		for (song s : songs) {
			if (s.song_album.toUpperCase().equals(keyword.toUpperCase()))
				filtered.add(s);
		}
		return filtered;
	}
	
	 /**
     * Method filters by year
     * 
     * @param songs an ArrayList of song information
     * @param keyword a String which is the filtered year
     */
	public static ArrayList<song> filterByYear(ArrayList<song> songs, String keyword) {
		ArrayList<song> filtered = new ArrayList<song>();
		for (song s : songs) {
			if (s.song_year.equals(keyword))
				filtered.add(s);
		}
		return filtered;
	}
	
	 /**
     * Method filters by genre
     * 
     * @param songs an ArrayList of song information
     * @param keyword a String which is the filtered genre
     */
	public static ArrayList<song> filterByGenre(ArrayList<song> songs, String keyword) {
		ArrayList<song> filtered = new ArrayList<song>();
		for (song s : songs) {
			if (s.song_genre.toUpperCase().equals(keyword.toUpperCase()))
				filtered.add(s);
		}
		return filtered;
	}
}
