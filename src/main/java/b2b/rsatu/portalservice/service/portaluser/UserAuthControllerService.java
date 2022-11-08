package b2b.rsatu.portalservice.service.portaluser;

import b2b.rsatu.portalservice.dto.user.UserCreateRequestDto;
import b2b.rsatu.portalservice.dto.user.UserDto;

public interface UserAuthControllerService {

    UserDto registrationUser(UserCreateRequestDto newUser);
}
