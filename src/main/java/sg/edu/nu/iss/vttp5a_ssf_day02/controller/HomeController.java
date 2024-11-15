package sg.edu.nu.iss.vttp5a_ssf_day02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping("/home")
public class HomeController {
    public String RequestMethodName(@RequestParam String param) {
        return param;
    }

    @GetMapping(path = { "", "/landing" })
    public String home(Model model) {
        model.addAttribute("currTime", new Date().toString());
        Calendar cal = Calendar.getInstance();
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));
        return "home";
    }
}
