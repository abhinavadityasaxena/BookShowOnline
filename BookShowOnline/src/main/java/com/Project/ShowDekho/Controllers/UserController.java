package com.Project.ShowDekho.Controllers;

import com.Project.ShowDekho.Model.User;
import com.Project.ShowDekho.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) { this.userService = userService; }

    @PostMapping(value = "showdekho.com/users/insert")
    public ResponseEntity<User> registerNewUser(@RequestBody User user){
        User currUser = userService.addNewUser(user);
        return ResponseEntity.ok(currUser);
    }

    @GetMapping(value = "showdekho.com/users/get")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
}
