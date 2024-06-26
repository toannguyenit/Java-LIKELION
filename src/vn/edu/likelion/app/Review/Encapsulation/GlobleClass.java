package vn.edu.likelion.app.Review.Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class GlobleClass {
    public static void main(String[] args) {
        PrivateClass privateClass = new PrivateClass();

        List<User> users = new ArrayList<User>();
        users.add(new User());
        users.add(new User());

        privateClass.setUsers(users);

        privateClass.showUsers();
    }
}
