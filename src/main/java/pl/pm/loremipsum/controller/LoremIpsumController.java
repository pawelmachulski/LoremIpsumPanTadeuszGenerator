package pl.pm.loremipsum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pm.loremipsum.Form;
import pl.pm.loremipsum.Lorem;
import pl.pm.loremipsum.PanTadeusz;

@Controller
public class LoremIpsumController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/generate")
    public String generate(@ModelAttribute Form form, ModelMap modelMap){
        Lorem lorem = new Lorem();
        PanTadeusz tad = new PanTadeusz();
            if (form.getTextoption() == 1) {
                if (form.getNumber() > 1500) {
                    modelMap.addAttribute("text", lorem.toString());
                } else if (form.getOption() == 1) {
                    modelMap.addAttribute("text", lorem.generateParagraphs(form.getNumber()));
                } else if (form.getOption() == 2) {
                    modelMap.addAttribute("text", lorem.generateSentences(form.getNumber()));
                } else if (form.getOption() == 3) {
                    modelMap.addAttribute("text", lorem.generateWords(form.getNumber()));
                }
            } else if (form.getTextoption() == 2) {
                if (form.getNumber() > 1500) {
                    modelMap.addAttribute("text", tad.toString());
                } else if (form.getOption() == 1) {
                    modelMap.addAttribute("text", tad.generateParagraphs(form.getNumber()));
                } else if (form.getOption() == 2) {
                    modelMap.addAttribute("text", tad.generateSentences(form.getNumber()));
                } else if (form.getOption() == 3) {
                    modelMap.addAttribute("text", tad.generateWords(form.getNumber()));
                }
            }
        return "home";
    }

}
