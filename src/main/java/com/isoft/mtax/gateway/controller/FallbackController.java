package com.isoft.mtax.gateway.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/mtax")
    public ResponseEntity<String> mtaxServiceFallback(){
        return ResponseEntity.ok("Mtax Service is currenly unavilable. Please Try again later");

    }
    @GetMapping("/portal")
    public ResponseEntity<String> portalServiceFallback(){
        return ResponseEntity.ok("Portal Service Currenly Unavailable");

    }


}
