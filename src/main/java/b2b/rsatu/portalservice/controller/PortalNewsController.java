package b2b.rsatu.portalservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class PortalNewsController {

    @PostMapping
    public ResponseEntity<?> createNews() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
