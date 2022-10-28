package b2b.rsatu.portalservice.dto.portalnews;

import b2b.rsatu.portalservice.dto.user.UserDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortalNewsResponseBO {

    private String name;
    private String description;
    private UserDto author;
    private String categoryName;
}
