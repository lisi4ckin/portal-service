package b2b.rsatu.portalservice.dto.user;

import lombok.Data;

@Data
public class UserDto {

    private String id;
    private String login;
    private String password;
    private Long profileId;
}
