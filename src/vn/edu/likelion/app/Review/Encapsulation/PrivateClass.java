package vn.edu.likelion.app.Review.Encapsulation;

import java.util.List;

public class PrivateClass implements InterfaceUser {
    private static  List<User> users;

    public void showUsers(){
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        PrivateClass.users = users;
    }

    @Override
    public void showUser() {

    }
}
