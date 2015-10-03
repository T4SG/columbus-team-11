package codeforgood.controller;

import org.springframework.web.bind.annotation.RestController;

import codeforgood.model.Profile;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CodeForGoodController {
    
    @RequestMapping("/hello")
    public String index(Profile profile) {
        return "Code For Good: " + profile.getUserId();
    }
    
}
