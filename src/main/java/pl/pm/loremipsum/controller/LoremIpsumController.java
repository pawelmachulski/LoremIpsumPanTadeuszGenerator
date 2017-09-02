package pl.pm.loremipsum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pm.loremipsum.Form;
import pl.pm.loremipsum.Lorem;

@Controller
public class LoremIpsumController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/generate")
    public String generate(@ModelAttribute Form form, ModelMap modelMap){
        Lorem lorem = new Lorem();
        if(form.getOption()==1){
            modelMap.addAttribute("text",lorem.generateParagraphs(form.getNumber()));
        }

        else if(form.getOption()==2){
            modelMap.addAttribute("text",lorem.generateSentences(form.getNumber()));
        }

        else if(form.getOption()==3){
            modelMap.addAttribute("text",lorem.generateWords(form.getNumber()));
        }
        return "home";
    }
}
