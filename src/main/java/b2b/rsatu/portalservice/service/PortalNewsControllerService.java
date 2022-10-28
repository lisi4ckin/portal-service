package b2b.rsatu.portalservice.service;

import b2b.rsatu.portalservice.dto.portalnews.PortalNewsCreationBO;
import b2b.rsatu.portalservice.dto.portalnews.PortalNewsResponseDto;

public interface PortalNewsControllerService {

    PortalNewsResponseDto createNews(PortalNewsCreationBO news);
}
