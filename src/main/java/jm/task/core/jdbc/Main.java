package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Aboba", "Abobovich", (byte) 67);
        userService.saveUser("Oboba", "Obobovich", (byte) 27);
        userService.saveUser("Kboba", "Kbobovich", (byte) 73);
        userService.saveUser("Yboba", "Ybobovich", (byte) 12);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
