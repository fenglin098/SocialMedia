import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SocialMedia social = new SocialMedia();
        social.setDb(createDB());
        Scanner sc = new Scanner(System.in);
        String answer;
        Boolean repeat = true;

        do {
            System.out.println("Which social media account do you want to log in?");
            System.out.print("Facebook, LinkedIn, Twitter, or Instagram: ");
            String socialMedia = sc.nextLine().toLowerCase();
            System.out.println();
            switch (socialMedia) {
                case "facebook":
                    Facebook fb = new Facebook();
                    fb.welcome();
                    fb.setDb(createDB());
                    System.out.print("Please enter your email address: ");
                    String userEmail = sc.next();
                    System.out.print("Please enter your password: ");
                    String userPassword = sc.next();
                    fb.check(userEmail, userPassword);
                    break;
                case "linkedin":
                    LinkedIn li = new LinkedIn();
                    li.welcome();
                    li.setDb(createDB());
                    System.out.print("Please enter your email address: ");
                    String userli = sc.next();
                    System.out.print("Please enter your password: ");
                    String pwli = sc.next();
                    li.check(userli, pwli);
                    break;
                case "twitter":
                    Twitter tw = new Twitter();
                    tw.welcome();
                    tw.setDb(createDB());
                    System.out.print("Please enter your email address: ");
                    String usertw = sc.next();
                    System.out.print("Please enter your password: ");
                    String pwtw = sc.next();
                    tw.check(usertw, pwtw);
                    break;
                case "instagram":
                    Instagram ig = new Instagram();
                    ig.welcome();
                    ig.setDb(createDB());
                    System.out.print("Please enter your email address: ");
                    String userig = sc.next();
                    System.out.print("Please enter your password: ");
                    String pwig = sc.next();
                    ig.check(userig, pwig);
                    break;

                default:
                    System.out.println("You did not choose the correct social media.");
                    break;
            }

            System.out.println();
            System.out.print("Would you like to log into another social media account? (Y/N): ");
            answer = sc.next();
            System.out.println();

        } while (answer.equalsIgnoreCase("y"));
        System.out.println("You have logged out! Goodbye <3");
        System.out.println();

    }

    public static ArrayList<userDataBase> createDB() {
        ArrayList<userDataBase> users = new ArrayList<>();
        userDataBase u = new userDataBase("user@gmail.com", "password");
        userDataBase u1 = new userDataBase("user1@gmail.com", "password");
        userDataBase u2 = new userDataBase("user2@gmail.com", "password");
        Collections.addAll(users, u, u1, u2);
        return users;
    }

    }

