package b2b.rsatu.portalservice.controller;

import b2b.rsatu.portalservice.dto.profile.ProfileCreateRequestDto;
import b2b.rsatu.portalservice.dto.profile.ProfileDto;
import b2b.rsatu.portalservice.service.portaluser.profile.ProfileControllerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/profile")
public class ProfileControllerCustom {

    @Resource
    private ProfileControllerService userProfileService;

    /* Метод получения профиля для текущего пользователя */
    @GetMapping
    public ResponseEntity<ProfileDto> getProfileByUserLogin(@RequestParam Long id) {
        return new ResponseEntity<>(userProfileService.getProfileById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ProfileDto> updateUserProfile(
            @RequestBody ProfileCreateRequestDto updateProfile,
            @RequestParam Long userId) {
        return new ResponseEntity<>(userProfileService.updateUserProfile(updateProfile, userId), HttpStatus.OK);
    }
}
