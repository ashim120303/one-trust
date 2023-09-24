package com.pack.onetrust.controllers;

import com.pack.onetrust.models.Trusted;
import com.pack.onetrust.models.Truster;
import com.pack.onetrust.repos.TrustedRepository;
import com.pack.onetrust.repos.TrusterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrustedController {
    @Autowired
    private TrustedRepository trustedRepository;
    @PostMapping("/trusted")
    public String saveTrustedForm(@ModelAttribute Trusted trusted) {
        trustedRepository.save(trusted);
        return "redirect:/trusted";
    }
}
