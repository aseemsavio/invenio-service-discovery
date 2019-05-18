package com.savio.invenio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class InvenioController {

    // To check if the microservice is live.
    @GetMapping("/all/lub")
    public Mono<String> lubDub() {
        Mono<String> dub = Mono.just("dub");
        return dub;
    }

}
