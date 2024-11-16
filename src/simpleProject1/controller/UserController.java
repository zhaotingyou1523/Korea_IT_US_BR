package simpleProject1.controller;

import simpleProject1.Model.dao.UserDao;
import simpleProject1.Model.dto.MessageContext;
import simpleProject1.Model.dto.User;
import simpleProject1.view.MainView;
import simpleProject1.view.UserView;

import java.util.Scanner;

public class UserController {
    private UserDao userDao = UserDao.getInstance();

    /**
     * signUp
     * @param id
     * @param password
     * @param name
     * @return
     */
    public User signUp(String id, String password, String name) {
        User user = new User(id, password, name);
        System.out.println(MessageContext.SUCCESS);
        return user;
    }

    /**
     * login
     * @param id
     * @param password
     * @return
     */
    public Boolean login(String id, String password) {
        return userDao.checkUser(id, password);
    }

    /**
     * logout
     * @return
     */
    public Boolean logout(){
        UserView.user = null;
        return true;
    }

    /**
     * addUser
     * @param user
     */
    public void addUser(User user) {
        userDao.addUser(user);
    }

    /**
     * checkId
     * @param id
     * @return
     */
    public boolean checkId(String id) {
        return userDao.checkId(id);
    }
}
