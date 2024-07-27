/**
 * @author Crescendo Revolution Team
 * boomPad. Login class includes information on accessing login
 */

package boompad;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class login{
    static login instance = new login();

    List<user> users = new ArrayList<>();
    public login(){
        File f = new File("account.txt");
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split("-");
                if (details.length == 2) {
                    String user_name = details[0];
                    String password = details[1];
                    users.add(new user(user_name, password, "user"));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public boolean verify(String user_name, String password){
        boolean verify = false;
        for (user u : users) {
            if (u.user_name.equals(user_name) && u.user_password.equals(password)) {
                verify = true;
                break;
            }
        }
        return verify;
    }

    public boolean registration(String user_name, String password) {
        boolean registration = true;
        for (user u : users) {
            if (u.user_name.equals(user_name)) {
                return false;
            }
        }
        BufferedWriter wr = null;
        try {
            wr = new BufferedWriter(new FileWriter("account.txt", true));
            wr.write("\n" + user_name + "-" + password);
            users.add(new user(user_name, password, "user"));
            wr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return registration;
    }
}
