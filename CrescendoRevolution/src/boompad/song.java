package boompad;

/**
 * @author Crescendo Revolution Team
 * Song class includes information on building the music database
 */

public class song {
    // ============================================================ Properties
    String song_name;
    String song_id;
    String song_artist;
    String song_year;
    String song_album;
    artist artist;
    String song_length;
    String song_producer;
    String song_genre;
// ============================================================ Methods
    /**
     * Constructor creates a song
     *
     * @param song_name a String name of a song
     * @param song_album a String id of a song
     * @param song_year a String released year of a song
     * @param song_genre a String genre of a song
     */
    public song(String song_name, String song_id, String song_artist, String song_year, String song_album, String song_length,
        String song_producer, String song_genre) {
        this.song_name = song_name;
        this.song_id = song_id;
        artist = new artist(song_artist,song_artist);
        this.song_artist = artist.artist_name;
        this.song_year = song_year;
        this.song_album = song_album;
        this.song_length = song_length;
        this.song_producer = song_producer;
        this.song_genre = song_genre;

    }
    /**
     * Constructor creates a song
     *
     * @param song_name a String name of a song
     */
    public song (String song_name, String song_artist){
        this.song_name = song_name;
        this.song_artist = song_artist;
     }


    // ============================================================ Setters
    /**
     * Sets the song artist
     *
     * @param song_artist a String
     */
    public void setSong_artist(String song_artist) {
        this.song_artist = song_artist;
    }

    /**
     * Sets the song feature
     *
     * @param song_id a String
     */
    public void setSong_id(String song_id) {
        this.song_id = song_id;
    }

    /**
     * Sets the song name
     *
     * @param song_name a String
     */
    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    /**
     * Sets the artist
     *
     * @param artist an artist
     */
    public void setArtist(artist artist) {
        this.artist = artist;
    }

    /**
     * Sets the song year
     * 
     * @param song_year a String 
     */
    public void setSong_year(String song_year) {
        this.song_year = song_year;
    }

    /**
     * Sets the song album
     * 
     * @param song_album a String 
     */
    public void setSong_album(String song_album) {
        this.song_album = song_album;
    }

    /**
     * Sets the song length
     * 
     * @param song_length a String 
     */
    public void setSong_length(String song_length) {
        this.song_length = song_length;
    }

    /**
     * Sets the producer name
     * 
     * @param song_producer a String 
     */
    public void setSong_producer(String song_producer) {
        this.song_producer = song_producer;
    }
    
    /**
     * Sets the song genre
     * 
     * @param song_genre a String
     */
    public void setSong_genre(String song_genre) {
		this.song_genre = song_genre;
	}
    
	/***** Getters *****/
    public String getSong_artist() {
        return song_artist;
    }

    public String getSong_id() {
        return song_id;
    }

    public String getSong_name() {
        return song_name;
    }

    public artist getArtist() {
        return artist;
    }

    public String getSong_album() {
        return song_album;
    }

    public String getSong_length() {
        return song_length;
    }

    public String getSong_producer() {
        return song_producer;
    }

    public String getSong_year() {
        return song_year;
    }
    
    public String getSong_genre() {
    	return song_genre;
    }

    /**
     * Overrides the toString method
     *
     * @return a String of information on the song, artist, album, release year, and genre
     * @return a String of information on the song and song id
     */
    @Override
    public String toString() {
        if (this.song_artist != null) {
            return this.song_name + " " + this.song_artist + " " + this.song_album + " " + this.song_year + " " + this.song_genre;
        }
        else {
            return this.song_name + " " + this.song_id;
        }
    }
}
