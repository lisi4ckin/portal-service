package b2b.rsatu.portalservice.dto.portalnews;

import b2b.rsatu.portalservice.entity.news.PortalNewsCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortalNewsCreationBO {

    private String name;
    private String description;
    private String authorLogin;

    private PortalNewsCategory newsCategory;
}
