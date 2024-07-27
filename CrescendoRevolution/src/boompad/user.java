package boompad;

/*
    boompad.class will save the user's information
 */
public class user {
    String user_name;
    String user_password;
    String user_type;

    public user(){
        this.user_name = null;
        this.user_password = null;
        this.user_type = "user";
    }
    public user(String user_name, String user_password, String user_type){
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_type = user_type;
    }

    /***** Setters *****/
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_id(String user_id) {
        this.user_password = user_id;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    /***** Getters *****/
    public String getUser_name() {
        return user_name;
    }

    public String getUser_id() {
        return user_password;
    }

    public String getUser_type() {
        return user_type;
    }

    @Override
    public String toString() {
        return this.user_name + " (" + this.user_type + ")";
    }
}
