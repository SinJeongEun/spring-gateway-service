package com.example.gatewayservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/v1.0/contents/1")
    public ResponseEntity<?> getTestMsg() {
        return ResponseEntity.ok("spring gatewqy test");
    }

    @GetMapping("/v1.0/newservice")
    public ResponseEntity<?> newService() {
        return ResponseEntity.ok("8/27 14시에 오픈되는 서비스");
    }
}
