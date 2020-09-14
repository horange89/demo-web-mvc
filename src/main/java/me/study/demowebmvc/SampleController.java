package me.study.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

    @PostMapping("/events")
    @ResponseBody
    public Event getEvent(@RequestParam String name,
                          @RequestParam Integer limit) {
        Event event = new Event();
        event.setName(name);
        event.setLimit(limit);

        return event;
    }

    @GetMapping("/events/form")
    public String eventsForm(Model model) {
        Event newEvent = new Event();
        newEvent.setLimit(50);
        model.addAttribute("event", newEvent);
        return "/events/form";
    }

}
