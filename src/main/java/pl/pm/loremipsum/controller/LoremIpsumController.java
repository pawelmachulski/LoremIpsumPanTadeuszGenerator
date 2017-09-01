package pl.pm.loremipsum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoremIpsumController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/")
    public String generate(ModelMap modelMap){
        modelMap.addAttribute("generator","Lorem ipsum dolor sit amet magna. Integer mi non enim aliquam imperdiet. Nullam vulputate tellus non orci. Integer semper facilisis felis, dignissim nibh. Aliquam adipiscing elit. Aliquam eget elit arcu, eget augue. Praesent scelerisque urna arcu quis dolor. Vestibulum ornare interdum, lacus. Vivamus ornare, odio eget wisi vel nonummy sagittis. Vestibulum vel bibendum iaculis malesuada id, neque. Vestibulum enim. Aliquam erat eu pede ultrices posuere cubilia Curae, Sed sed justo. Phasellus tempor enim diam magna auctor varius, felis in neque quis massa metus gravida vel, adipiscing diam eu libero. Duis quis wisi. Phasellus vulputate eu, fringilla mi, eu dui eget pede dictum a, mauris. Etiam ullamcorper, risus suscipit.");
        return "home";
    }
}
