package b2b.rsatu.portalservice.service.portaluser;

import b2b.rsatu.portalservice.entity.PortalUser;

public interface PortalUserService {

    PortalUser getPortalUserByLogin(String userLogin);

    PortalUser getPortalUserById(Long id);
}
