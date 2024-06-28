import vn.edu.likelion.app.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void changeFirstElement(ArrayList<User> arrUser) {
        arrUser.get(0).setEmail("anhtuan@gmail.com");
    }

    static void showEmailUsers(ArrayList<User> arrUser) {
        for (User user : arrUser) {
            System.out.println(user.getEmail());
        }
    }

    static final int MA_LOP_HOC;
    static {
// Gán giá trị cho hằng số trong khối static
        MA_LOP_HOC = 112233;
// Ko thể gán giá trị cho hằng số trong phương thức static
//        MA_LOP_HOC = 112;

    }

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        User user1 = new User("Song Toan1", "123123", "songtoan@gmmail.com","0123456789");
        User user2 = new User("Song Toan2", "123123", "songtoan@gmmail.com","0123456789");
        User user3 = new User("Song Toan3", "123123", "songtoan@gmmail.com","0123456789");
        User user4 = new User("Song Toan4", "123123", "songtoan@gmmail.com","0123456789");
        User user5 = new User("Song Toan5", "123123", "songtoan@gmmail.com","0123456789");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        showEmailUsers(users);

        changeFirstElement(users);

        showEmailUsers(users);



    }
}
