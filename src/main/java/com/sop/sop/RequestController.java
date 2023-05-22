package com.sop.sop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class RequestController {

    @GetMapping("/teste")
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok("Teste");
    }
}
