package com.example.demo.wniosekUser;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


//http://localhost:8080/form
@RestController
public class WniosekController {

    public final WniosekService wniosekService;

    @Autowired
  public WniosekController(WniosekService wniosekService) {
        this.wniosekService =  wniosekService;
    }

    @GetMapping("/wnioski")
    public ModelAndView listWnioski() {
        ModelAndView modelAndView = new ModelAndView();

        List<Wniosek> listWnioski = wniosekService.getWniosek();

        if (!listWnioski.isEmpty()) {
            modelAndView.addObject("wnioskiLista", listWnioski);
        }

        modelAndView.setViewName("wnioskiLista"); // Nazwa widoku stosowana w html po <tr th:each="wniosek: ${wnioskiLista}">

        return modelAndView;
    }



//----------------------------------
    @GetMapping("/form")//met. wyświetla html wniosekUser
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("wniosekUser");
        return modelAndView;
    }

    @PostMapping("/add")//-metod gdy klikamy na button<form action="/add" method="post">
    public ModelAndView addNewWniosek(  //wniosek zapisuje się w bazie i widzimy sukces.html
            @ModelAttribute Wniosek wniosek,
            Model model
    ) {
        wniosekService.addNewWniosek(wniosek);

        ModelAndView modelAndView = new ModelAndView("sukces"); // Przekierowanie na /sukces html
        modelAndView.addObject("message", "Sukces!");
        //w html <body> <h1 th:text="${message}">Sukces!</h1>
        return modelAndView;
    }

//    @DeleteMapping(path = "{wniosekId}")
//    public void deleteWniosek(@PathVariable("wniosekId") Long id){
//        wniosekService.deleteWniosek(id);
//    }


}


