package com.example.demo.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8080/
@RestController
public class UserController {

    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService =  userService;
    }

    @GetMapping("/")//met. wyświetla html home
    public ModelAndView welcomeLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @PostMapping("/logUser")
    public ModelAndView loginUser(
            @RequestParam("mailP") String mailP,
            @RequestParam("hasloP") String hasloP
    ) {
        ModelAndView modelAndView = new ModelAndView();

        if ("it1@wp.pl".equals(mailP) && "haslo2".equals(hasloP)
                ||"it2@wp.pl".equals(mailP) && "haslo3".equals(hasloP)) {
            modelAndView.setViewName("wniosekUser");
            modelAndView.addObject("message2", "Uzupełnij!");
        } else {
            modelAndView.setViewName("errorPageLogU"); // Tworzymy stronę błędu
            modelAndView.addObject("errorMessage",
                    "Błędny mail lub hasło.");
            //w html <body> <h1 th:text="${errorMessage}">Błędny mail lub hasło. Aby wrócić do formularza, wpisz http://localhost:8080</h1>
        }

        return modelAndView;
    }


//    @PostMapping("/logUser")//-metod gdy klikamy na button<form action="/logUser" method="post">
//                                //wniosek zapisuje się w bazie i widzimy wniosekUser.html
//    public ModelAndView loginUser(
//            Model model
//    ) {
//
//        ModelAndView modelAndView = new ModelAndView("wniosekUser"); // Przekierowanie na /wniosekUser html
//        modelAndView.addObject("message2", "Uzupełnij!");
//        //w html <body> <h1 th:text="${message2}">Uzupełnij!</h1>
//        return modelAndView;
//    }

    @PostMapping("/logAdm")
    public ModelAndView loginAdmin(
            @RequestParam("mailA") String mailP,
            @RequestParam("hasloA") String hasloP
    ) {
        ModelAndView modelAndView = new ModelAndView();

        if ("admin@wp.pl".equals(mailP) && "haslo1".equals(hasloP)) {
            modelAndView.setViewName("adminPage");
            modelAndView.addObject("message3", "Uzupełnij!");
        } else {
            modelAndView.setViewName("errorPageLogAdm"); // Tworzymy stronę błędu
            modelAndView.addObject("errorMessage2",
                    "Błędny mail lub hasło.");
            //w html <body> <h1 th:text="${errorMessage}">Błędny mail lub hasło. Aby wrócić do formularza, wpisz http://localhost:8080</h1>
        }

        return modelAndView;
    }

}
