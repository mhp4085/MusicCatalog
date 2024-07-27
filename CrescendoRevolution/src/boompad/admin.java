package boompad;

/*
    boompad.admin class let administrators have access to manage users and catalog
 */
public class admin extends user{

    // ============================================================ Methods
    /**
     * Constructor creates an admin
     * 
     * @param user_name a String name of a user
     * @param user_id a String id of a user
     * @param user_type a String type of a user
     */
    public admin(String user_name, String user_id, String user_type) {
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
    public void setUser_id(String user_id) {
        super.setUser_id(user_id);
    }

    @Override
    public void setUser_type(String user_type) {
        super.setUser_type(user_type);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
