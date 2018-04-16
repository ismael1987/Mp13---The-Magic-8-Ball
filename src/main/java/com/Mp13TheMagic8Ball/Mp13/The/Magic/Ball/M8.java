package com.Mp13TheMagic8Ball.Mp13.The.Magic.Ball;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/")
public class M8 {

    @GetMapping
    String page(Model model){
        List<String> m8 = new ArrayList<>();
        m8.add("hi how are u");
        m8.add("are u hungry");
        m8.add("lets go play");
        m8.add("the weather nice today");
        Collections.shuffle(m8);
         model.addAttribute("value1",m8.get(0));
        return "Home";
    }

}
