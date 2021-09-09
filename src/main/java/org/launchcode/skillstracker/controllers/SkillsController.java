package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String displaySkillsList() {
        return "<h1>Skills Tracker</h3>" +
                "<h2>Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillsForm() {
        return "<p>Name: </p>" +
                "<input type='text' name='name'>" +
                "<form action='form' method='posting'>" +
                "<p>My favorite language:</p>" +
                "<select name='first'>" +
                "<option value=java''> Java </option>" +
                "<option value='javascript'> JavaScript </option>" +
                "<option value='python'> Python </option>" +
                "</select>" +

                "<p>My second favorite language:</p>" +
                "<select name='second'>" +
                "<option value='java'> Java </option>" +
                "<option value='javascript'> JavaScript </option>" +
                "<option value='python'> Python </option>" +
                "</select>" +

                "<p>My third favorite language:</p>" +
                "<select name='third'>" +
                "<option value='java'> Java </option>" +
                "<option value='javascript'> JavaScript </option>" +
                "<option value='python'> Python </option>" +
                "</select>" +

                "<input type='submit' value='submit'>" +
                "</form>"
                ;
    }

    @PostMapping("form")
    @ResponseBody
    public String listFavoriteSkills(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>"
                ;
    }

}
