package b2b.rsatu.portalservice.service.portaluser.profile;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.Profile;

public interface ProfileService {

    Profile createProfileNewUser(PortalUser newUser);

    Profile updateUserProfile(Profile updateProfile, Long userId);

    Profile getProfile(Long id);
}
