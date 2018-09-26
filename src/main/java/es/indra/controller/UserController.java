package es.indra.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping(path = "list")
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
