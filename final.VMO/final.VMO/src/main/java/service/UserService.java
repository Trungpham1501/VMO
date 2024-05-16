package service;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(User user){
        System.out.println(user);
    }

    public void updateInforUser(Integer id, String email, String name){
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User không tồn tại"));
        user.setUserName(name);
        user.setEmail(email);
        userRepository.save(user);
    }

    public void deleteById(Integer id){
        boolean exists = userRepository.existsById(userid);
        if(!exists){
            throw new IllegalStateException("user with id"+ userid + "does not exists");
        }
        userRepository.deleteById(userid);
    }

    public void findUsersByUserName(String userName){
        userRepository.findUsersByUserName(userName);
    }


}
