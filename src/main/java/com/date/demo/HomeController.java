package com.date.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "redirect:/main.html";
    }

    @RequestMapping("/date")
    public String date(Model model) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,' The'  d 'of' MMMM, yyyy");
        model.addAttribute("date",date.format(formatter));
        return "date.jsp";
    }
    @RequestMapping("/time")
    public String time(Model model) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a");
        model.addAttribute("time",time.format(formatter));
        return "Time.jsp";
    }

}
