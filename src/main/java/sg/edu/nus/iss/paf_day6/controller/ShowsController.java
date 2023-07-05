package sg.edu.nus.iss.paf_day6.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.paf_day6.model.Show;
import sg.edu.nus.iss.paf_day6.service.ShowsService;

@Controller
@RequestMapping
public class ShowsController {
    
    @Autowired
    private ShowsService svc;

    @GetMapping
    public String displayPage(Model model) {
        model.addAttribute("show", new Show());
        return "form";
    }

    @PostMapping()
    public String searchShow(Model model, @ModelAttribute Show displayShow) {
        Optional<Show> result = repo.svc()

        if 
    }


}
