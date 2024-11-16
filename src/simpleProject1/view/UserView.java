package simpleProject1.view;

import simpleProject1.Model.dao.UserDao;
import simpleProject1.Model.dto.User;
import simpleProject1.controller.UserController;

import java.util.Scanner;

public class UserView {
    public Scanner sc = new Scanner(System.in);
    public UserController userController = new UserController();
    public static User user = new User();

    /**
     * sign up
     */
    public void signupView(){
        while (true) {
            System.out.println("---- sign up ----");
            System.out.println("Enter id: ");
            String id = sc.nextLine();
            if (!userController.checkId(id)) {
                System.out.println("You are already registered!");
                continue;
            }
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();

            User user = userController.signUp(id, password, name);
            userController.addUser(user);
            return;
        }
    }

    /**
     * login
     */
    public boolean loginView() {
        System.out.println("---- login ----");
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if (userController.login(id, password)) {
            System.out.println("Welcome " + user.getName() + "!");
            System.out.println("You have successfully logged in!");
            return true;
        }
        System.out.println("You have not successfully logged in!");
        return false;

    }
}
