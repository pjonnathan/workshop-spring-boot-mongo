package com.pjonnathan.workshopmongo.resources;

import com.pjonnathan.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> fillAll(){
        User maria = new User("1", "maria", "maria@gmail.com");
        User caio = new User("2", "caio", "caio@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, caio));
        return ResponseEntity.ok().body(list);
    }
}
