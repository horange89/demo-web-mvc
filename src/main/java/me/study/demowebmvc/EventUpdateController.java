package me.study.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class EventUpdateController {


    @ResponseBody
    @PutMapping(value = "/events/{id}")
    public String putEvents(@PathVariable("id") int id)
    {
        return "events " + id;
    }

    @ResponseBody
    @PostMapping(value = "/events")
    public String postEvents() {
        return "events";
    }
}
