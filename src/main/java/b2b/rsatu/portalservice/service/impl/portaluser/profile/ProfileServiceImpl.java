package b2b.rsatu.portalservice.service.impl.portaluser.profile;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.Profile;
import b2b.rsatu.portalservice.repository.ProfileRepository;
import b2b.rsatu.portalservice.service.portaluser.PortalUserService;
import b2b.rsatu.portalservice.service.portaluser.profile.ProfileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Resource
    private ProfileRepository profileRepository;

    @Resource
    private PortalUserService portalUserService;

    @Override
    public Profile createProfileNewUser(PortalUser newUser) {
        Profile profile = new Profile();
        return profileRepository.save(profile);
    }

    @Override
    public Profile updateUserProfile(Profile updateProfile, Long userId) {
        PortalUser profileOwner = portalUserService.getPortalUserById(userId);
        updateProfile.setId(profileOwner.getId());
        profileRepository.save(updateProfile);
        return updateProfile;
    }

    @Override
    public Profile getProfile(Long id) {
        return profileRepository.getReferenceById(id);
    }
}
