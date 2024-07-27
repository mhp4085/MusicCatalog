/**
 * @author Crescendo Revolution Team
 * boomPad.moderators class includes information on the catalog
 */


package boompad;

/*
    moderators will have access to manage catalog
 */
public class moderators extends admin{

     // ============================================================ Methods
    /**
     * Constructor creates a moderator
     * 
     * @param user_name a String name of a user
     * @param user_id a String id of a user
     * @param user_type a String type of a user
     */
    public moderators(String user_name, String user_id, String user_type) {
        super(user_name, user_id, user_type);
    }
    /***** Getters *****/
    @Override
    public String getUser_name() {
        return super.getUser_name();
    }

    @Override
    public String getUser_id() {
        return super.getUser_id();
    }

    @Override
    public String getUser_type() {
        return super.getUser_type();
    }
    /***** Setters *****/
    @Override
    public void setUser_name(String user_name) {
        super.setUser_name(user_name);
    }

    @Override
    public void setUser_type(String user_type) {
        super.setUser_type(user_type);
    }

    @Override
    public void setUser_id(String user_id) {
        super.setUser_id(user_id);
    }

    public song createSong(String songName, String songId, String songArtist, String year, String ablum, String length, String producer, String genre){
        return new song(songName, songId, songArtist, year, ablum, length, producer, genre);
    }

    public song createSong(String songName, String songId) {
        return new song(songName, songId);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

