package b2b.rsatu.portalservice.dto.user;

import lombok.Data;

@Data
public class UserCreateRequestDto extends UserDto {
    private String login;
    private String password;
}
