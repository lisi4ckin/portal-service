package b2b.rsatu.portalservice.controller;

import b2b.rsatu.portalservice.dto.UserCreateRequestDto;
import b2b.rsatu.portalservice.dto.UserDto;
import b2b.rsatu.portalservice.service.UserAuthControllerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserAuthControllerService authControllerService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(
            @RequestBody UserCreateRequestDto newUser) {
        return new ResponseEntity<>(authControllerService.registrationUser(newUser), HttpStatus.OK);
    }
}
