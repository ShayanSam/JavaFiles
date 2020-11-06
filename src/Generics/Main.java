package Generics;

public class Main {
    public static void main(String[] args) {
        User user = new Instructior(20);
        Utils.printUser(user);
        GenericList<User> users = new GenericList<>();
        Utils.printUsers(users);
    }
}
