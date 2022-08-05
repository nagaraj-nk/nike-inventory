package com.nike.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class WebServiceController {

    @GetMapping("/")
    public String getProduct() {
        return "Sample Product Name";
    }
}
