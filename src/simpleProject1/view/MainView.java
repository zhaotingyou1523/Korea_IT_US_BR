package simpleProject1.view;
import java.util.Scanner;

public class MainView {
    public Scanner sc = new Scanner(System.in);
    public UserView userView = new UserView();
    public void mainView(){
        while(true) {
            System.out.println("---- US_BR ----");
            System.out.println("1.Login");
            System.out.println("2.SignUp");
            System.out.println("*.Exit");
            System.out.println("Enter your choice:");
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid choice");
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    userView.loginView();
                    break;
                case 2:
                    userView.signupView();
                    break;
                default:
                    System.out.println("System end");
                    return;
            }
        }
    }
}
