package org.example.springbootvmornek.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VmController {

    @GetMapping
    private String getVmWork(){

        return "VM WORKS!!!";
    }
}
