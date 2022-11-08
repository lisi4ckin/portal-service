package b2b.rsatu.portalservice.service.news;

import b2b.rsatu.portalservice.dto.portalnews.PortalNewsCreationBO;
import b2b.rsatu.portalservice.dto.portalnews.PortalNewsResponseBO;

public interface PortalNewsControllerService {

    PortalNewsResponseBO createNews(PortalNewsCreationBO news);
}
