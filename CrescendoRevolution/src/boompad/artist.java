/**
 * @author Crescendo Revolution Team
 * 
 * boompad.artist class includes the information about the artist and
 * the songs made by the artist
 */

package boompad;

/*
 	Solomia Semenyuk can commit changes
    boompad.artist class will in could the information about the artist and the songs made by the artist
 */
public class artist {
    // ============================================================ Properties
    String artist_name;
    String artist_id;

    // ============================================================ Methods
    /**
     * Constructor creates an artist.
     * 
     * @param artist_name a String name of an artist
     * @param artist_id a String id of an artist
     */
    public artist(String artist_name, String artist_id){
        this.artist_name = artist_name;
        this.artist_id = artist_id;
    }

    /***** Setters *****/
    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public void setArtist_id(String artist_id) {
        this.artist_id = artist_id;
    }

    /***** Setters *****/
    public String getArtist_name() {
        return artist_name;
    }

    public String getArtist_id() {
        return artist_id;
    }

    @Override
    public String toString() {
        return this.artist_name + " " + this.artist_id;
    }
}
