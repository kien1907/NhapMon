/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.User;
import java.util.ArrayList;
import repository.UserRepo;

/**
 *
 * @author admin
 */
public class UserService {

    private UserRepo userRepo = new UserRepo();

    public User getUser(String userName, String passWord) {
       return this.userRepo.geUser(userName, passWord);
    }
}
