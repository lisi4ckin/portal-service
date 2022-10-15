package b2b.rsatu.portalservice.controller;

import b2b.rsatu.portalservice.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto newUser) {
        return null;
    }
}
