package me.study.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class SampleController {

    @ResponseBody
    @GetHelloMapping
    public String hello() {
        return "hello";
    }

    @ResponseBody
    @GetMapping("/events")
    public String getEvents() {
        return "events";
    }

    @ResponseBody
    @GetMapping("/events/{id}")
    public String getEventsWithId(@PathVariable("id") int id) {
        return "events " + id;
    }

    @DeleteMapping("/events/{id}")
    @ResponseBody
    public String deleteEvents(@PathVariable("id") int id) {
        return "events";
    }

}
