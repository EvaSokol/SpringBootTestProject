package de.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Eva Sokolyanskaya on 28/03/2018.
 */
//@Controller
@SpringBootApplication
//@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class Application {

//    final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    public Application(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @RequestMapping("/hello")
//    public String showHelloWorld(){
//        return "Hello-World";
//    }
//
//    @PostMapping(value = "/user/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<User> create(@PathVariable String username) {
//        User appUser = new User();
//        appUser.setUsername(username);
//        User saved = userRepository.save(appUser);
//        return ResponseEntity.ok().body(saved);
//    }
//
//    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<User>> findAll() {
//        final List<User> resultList = new ArrayList<>();
//        final Iterable<User> all = userRepository.findAll();
//        all.forEach(resultList::add);
//        return ResponseEntity.ok().body(resultList);
//    }
}
