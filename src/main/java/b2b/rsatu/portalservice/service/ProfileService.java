package b2b.rsatu.portalservice.service;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.Profile;

public interface ProfileService {

    Profile createProfileNewUser(PortalUser newUser);
}
