package gitroom.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import gitroom.backend.entity.User;
import gitroom.backend.repository.UserRepository;

@RestController
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
