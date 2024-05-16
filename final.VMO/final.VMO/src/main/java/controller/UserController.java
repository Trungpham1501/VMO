package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService)
    {

        this.userService = userService;
    }
    @GetMapping("")
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get-all-user")
    List<TestDTO> getUsersV2(String email, String fullName){
        return userService.getUsersV2(email, fullName);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping(path =" {userid}")
    public void deleteById(@PathVariable("userid") int id){
        userService.deleteById(id);
    }

}
