package de.springboot.controller;

import de.springboot.domain.User;
import de.springboot.repository.UserRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eva Sokolyanskaya on 07/04/2018.
 */
@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HomeController {

    final UserRepository userRepository;

    @Inject
    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @GetMapping(value = "/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Hello there !");
    }

    @PostMapping(value = "/user/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@PathVariable String username) {
        User appUser = new User();
        appUser.setUsername(username);
        User saved = userRepository.save(appUser);
        return ResponseEntity.ok().body(saved);
    }

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> findAll() {
        final List<User> resultList = new ArrayList<>();
        final Iterable<User> all = userRepository.findAll();
        all.forEach(resultList::add);
        return ResponseEntity.ok().body(resultList);
    }
}
