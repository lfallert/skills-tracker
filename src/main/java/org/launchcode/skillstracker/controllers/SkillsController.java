package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</l1>" +
                "<li>JavaScript</l1>" +
                "<li>Python</l1>" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String displayForm() {
        return "<form method='post'>" +
                "<label>Name:</label>" +
                "<input type='text' name='name'/>" +
                "<br><label>My favorite language:</label><br>" +
                "<select name='first'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br><label>My favorite language:</label><br>" +
                "<select name='second'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br><label>My favorite language:</label><br>" +
                "<select name='third'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(@RequestParam String name,
                              @RequestParam String first,
                              @RequestParam String second,
                              @RequestParam String third) {


        return "<h1>" + name + "</h1><br>" +
                "<ol>" +
                "<li>" + processReturn(first) + "</li>" +
                "<li>" + processReturn(second) + "</li>" +
                "<li>" + processReturn(third) + "</li>" +
                "<ol>";
    }

    private String processReturn(String value) {
        if(value.equals("java")){
            return "Java";
        } else if (value.equals("javascript")) {
            return "JavaScript";
        } else {
            return "Python";
        }
    }

}
