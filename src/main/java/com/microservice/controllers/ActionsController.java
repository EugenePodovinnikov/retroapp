package com.microservice.controllers;

import com.microservice.services.EbayCrawlerService;
import kong.unirest.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ActionsController {

    @Autowired
    private EbayCrawlerService ebayCrawlerService;

    @GetMapping("/search")
    public JsonNode searchForConsole(@RequestParam String q) {
        return ebayCrawlerService.searchForConsole(q);
    }
}
