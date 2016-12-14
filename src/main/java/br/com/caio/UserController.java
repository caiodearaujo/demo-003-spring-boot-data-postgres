package br.com.caio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caioaraujo on 14/12/16.
 */
@Controller
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/insert")
    @ResponseBody
    public String insert(){
        User u = new User();
        u.setUsername("Teste");
        u.setPassword("Teste");
        return repo.save(u).toString();
    }

    @GetMapping("/list")
    @ResponseBody
    public List<User> getAll(){
        List<User> users = new ArrayList<>();
        repo.findAll().forEach(users::add);
        return users;
    }

}
