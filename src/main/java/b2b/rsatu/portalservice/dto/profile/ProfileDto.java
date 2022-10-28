package b2b.rsatu.portalservice.dto.profile;

import b2b.rsatu.portalservice.dto.user.UserDto;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileDto {

    private String fullName;

    private LocalDate birthday;

    //todo Переделать на дто группы
    private String group;

    private UserDto portalUser;
}