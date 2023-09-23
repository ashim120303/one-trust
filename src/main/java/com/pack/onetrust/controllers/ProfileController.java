package com.pack.onetrust.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/truster")
    public String truster() {
        return "truster";
    }

    @GetMapping("/trusted")
    public String trusted() {
        return "trusted";
    }
}
