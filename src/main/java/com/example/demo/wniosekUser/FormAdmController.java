package com.example.demo.wniosekUser;
import com.example.demo.wniosekUser.WniosekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class FormAdmController {


public final WniosekService wniosekService;

    @Autowired

    public FormAdmController(WniosekService wniosekService) {
        this.wniosekService = wniosekService;
    }


//    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    //Wygląda na to, że próbujesz wysłać żądanie typu PATCH za pomocą formularza HTML.
//    // Jednakże, standardowy formularz HTML nie obsługuje bezpośrednio metody PATCH,
//
    @PatchMapping ("/sdAdm")
    public ModelAndView patchAdmin1(
            @RequestParam("nameF") String name,
            @RequestParam("dietaStawka") int nowaDieta
    ) {
        ModelAndView modelAndView = new ModelAndView();


        if ("ABC".equals(name)) { // Używamy == do porównania Long z Long
            wniosekService.patchFormAdm(name, nowaDieta);
            modelAndView.setViewName("adminSukces");
            modelAndView.addObject("message4", "Sukces!!!");
        }
        else {
            modelAndView.setViewName("errorPatch1");
            modelAndView.addObject("errorMessage123", "Błąd id");
        }

        return modelAndView;
    }



}
