package b2b.rsatu.portalservice.dto.portalnews;

import b2b.rsatu.portalservice.dto.user.UserDto;
import b2b.rsatu.portalservice.entity.news.PortalNewsCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortalNewsCreationBO {

    private String description;
    private UserDto author;

    private PortalNewsCategory newsCategory;
}
