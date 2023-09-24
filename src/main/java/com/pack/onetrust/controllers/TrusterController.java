package com.pack.onetrust.controllers;

import com.pack.onetrust.models.Truster;
import com.pack.onetrust.repos.TrusterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrusterController {
    @Autowired
    private TrusterRepository trustedRepository;
    @PostMapping("/truster")
    public String saveTrustedForm(@ModelAttribute Truster truster) {
        trustedRepository.save(truster);
        return "redirect:/truster";
    }
}