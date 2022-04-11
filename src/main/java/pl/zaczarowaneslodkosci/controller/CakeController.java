package pl.zaczarowaneslodkosci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CakeController {

    @GetMapping("/start")
    public String goTest(Model model) {
        model.addAttribute("title", "My Title");
        return "start";
    }
}