package b2b.rsatu.portalservice.service;

import b2b.rsatu.portalservice.dto.UserCreateRequestDto;
import b2b.rsatu.portalservice.dto.UserDto;

public interface UserAuthControllerService {

    UserDto registrationUser(UserCreateRequestDto newUser);
}
