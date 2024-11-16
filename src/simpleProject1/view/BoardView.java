package simpleProject1.view;

import simpleProject1.Model.dto.Board;
import simpleProject1.controller.BoardController;
import simpleProject1.controller.UserController;

import java.util.Scanner;

public class BoardView {
    public Scanner sc = new Scanner(System.in);
    public UserController userController = new UserController();
    public BoardController boardController = new BoardController();
    public void write() {
        System.out.println("---- BOARD ----");
        System.out.println("---- USER: " + userController.getUser().getName() + " ----");
        System.out.println("Please enter your Message: ");
        String message = sc.nextLine();
        boardController.addBoard(message);
    }
    public void read() {
        System.out.println("---- BOARD ----");
        System.out.println("---- USER: " + userController.getUser().getName() + " ----");
        for (Board board : boardController.boardDao.boardList) {
            if (board.getUserName().equals(userController.getUser().getName())){
                System.out.println(board);
            }
        }
    }
}
