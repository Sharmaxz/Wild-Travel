package com.sharmaxz.controller;

import com.sharmaxz.model.Client;
import com.sharmaxz.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class LoginController {
    @Autowired
    ClientRepository clientRepository;

    @RequestMapping (value = "/login" , method = RequestMethod.GET )
    public String index(){return "WEB-INF/login/login.jsp";}

    @RequestMapping(value = "create", method = RequestMethod.POST )
    public Client create(@RequestParam("InputRName") String name,
                         @RequestParam("surname") String surname,
                         @RequestParam("email") String email,
                         @RequestParam("password") String password) {
        Client client = new Client(name, surname, email, password);
        //client.setName();
        return clientRepository.save(client);
    }

}
