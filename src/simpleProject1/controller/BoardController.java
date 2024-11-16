package simpleProject1.controller;

import simpleProject1.Model.dao.BoardDao;
import simpleProject1.Model.dao.UserDao;
import simpleProject1.Model.dto.Board;
import simpleProject1.Model.dto.User;

public class BoardController {
    public UserDao userDao = UserDao.getInstance();
    public BoardDao boardDao = BoardDao.getInstance();
    public void addBoard(String message) {
        boardDao.addBoard(userDao.user.getName(),message);
    }
}
