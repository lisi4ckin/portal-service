package b2b.rsatu.portalservice.controller;

import b2b.rsatu.portalservice.dto.profile.ProfileCreateRequestDto;
import b2b.rsatu.portalservice.dto.profile.ProfileDto;
import b2b.rsatu.portalservice.dto.user.UserCreateRequestDto;
import b2b.rsatu.portalservice.dto.user.UserDto;
import b2b.rsatu.portalservice.service.portaluser.profile.ProfileControllerService;
import b2b.rsatu.portalservice.service.portaluser.UserAuthControllerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping
    public ResponseEntity<UserDto> getUserByLogin(@RequestParam String userLogin) {
        //toDo Переделать данный метод в тот момент, когда потребуется
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
