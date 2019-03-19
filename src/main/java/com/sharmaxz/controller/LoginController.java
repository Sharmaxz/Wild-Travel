package com.sharmaxz.controller;

import com.sharmaxz.model.Client;
import com.sharmaxz.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class LoginController {
    @Autowired
    ClientRepository clientRepository;

    @RequestMapping (value = "/login" , method = RequestMethod.GET )
    public String index(@RequestParam(value = "mensagem", required = false) String  mensagem){
        if(mensagem != null) {
            //model.
        }
        return "WEB-INF/login/login.jsp";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST )
    public String create(@RequestParam("InputRName") String name,
                         @RequestParam("InputRSurname") String surname,
                         @RequestParam("InputREmail") String email,
                         @RequestParam("InputRPassword") String password,
                         RedirectAttributes redirectAttributes
                         ) {
        Client client = new Client(name, surname, email, password);
        client = clientRepository.save(client);

        redirectAttributes.addAttribute("mensagem", "Usuario " + name + " salvo com sucesso");
        return "redirect:/login";
    }

}
