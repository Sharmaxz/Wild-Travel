package com.sharmaxz.controller;

import com.sharmaxz.interceptor.UserSession;
import com.sharmaxz.model.Client;
import com.sharmaxz.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;


@Controller
public class LoginController {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    UserSession userSession;

    @RequestMapping (value = "/login" , method = RequestMethod.GET )
    public String index(){
        return "WEB-INF/login/login.jsp";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST )
    public String create(@RequestParam("InputRName") String name,
                         @RequestParam("InputRSurname") String surname,
                         @RequestParam("InputREmail") String email,
                         @RequestParam("InputRPassword") String password
    ) {
        Client client = new Client(name, surname, email, password);
        client = clientRepository.save(client);

        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST )
    public String create(@RequestParam("InputEmail") String email,
                         @RequestParam("InputPassword") String password,
                         Map<String, Object> model) {
        Client client = clientRepository.findByEmail(email);
        System.out.println(client);
        if(client != null && client.getPassword().equals(password)) {
            userSession.addLoggerUser(client);
            return "redirect:/";
        }else{
            model.put("message", "Login not valid");
            return "/login";
        }
    }

}


//    @RequestMapping (value = "/login" , method = RequestMethod.GET )
//    public String index(@RequestParam(value = "mensagem", required = false) String  mensagem){
//        if(mensagem != null) {
//            //model.
//        }
//        return "WEB-INF/login/login.jsp";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST )
//    public String create(@RequestParam("InputRName") String name,
//                         @RequestParam("InputRSurname") String surname,
//                         @RequestParam("InputREmail") String email,
//                         @RequestParam("InputRPassword") String password,
//                         RedirectAttributes redirectAttributes
//    ) {
//        Client client = new Client(name, surname, email, password);
//        client = clientRepository.save(client);
//
//        redirectAttributes.addAttribute("mensagem", "Usuario " + name + " salvo com sucesso");
//        return "redirect:/login";
//    }
