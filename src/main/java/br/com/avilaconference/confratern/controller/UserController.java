package br.com.avilaconference.confratern.controller;

import br.com.avilaconference.confratern.model.User;
import br.com.avilaconference.confratern.service.IUserService;
import br.com.avilaconference.confratern.service.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addnewuser")
    public ResponseEntity<User> addNewUser(@RequestBody User user){
        return ResponseEntity.status(201).body(userService.registerUser(user));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> findAllUsers(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Integer id){
        return ResponseEntity.ok().body(userService.getUserById(id));
    }

    @GetMapping("/user/email/{email}")
    public ResponseEntity<User> findUserByEmail(@PathVariable String email){
        return ResponseEntity.ok().body(userService.getUserByEmail(email));
    }

}

