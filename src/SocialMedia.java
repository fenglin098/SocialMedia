import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SocialMedia {
    private ArrayList<userDataBase> db;

    public SocialMedia() {
    }

    public ArrayList<userDataBase> getDb() {
        return db;
    }

    public void setDb(ArrayList<userDataBase> db) {
        this.db = db;
    }

    public void welcome (){
        System.out.println("Thank you for choosing Social Media!");
    }

    public void check (String userEmail, String userPassword) {
            for (userDataBase u : db) {
                if (u.getUserEmail().equals(userEmail)) {
                    userDataBase udb = u;
                    if (udb.getUserPassword().equals(userPassword)){
                        login();
                    }else {
                        System.out.println("Invalid login.");
                    }
                }
            }
    }



    public void login (){
        System.out.println("You have logged in");
    }

}
