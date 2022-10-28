package b2b.rsatu.portalservice.service;

import b2b.rsatu.portalservice.entity.PortalUser;

public interface PortalUserService {

    PortalUser getPortalUserByLogin(String userLogin);

}
