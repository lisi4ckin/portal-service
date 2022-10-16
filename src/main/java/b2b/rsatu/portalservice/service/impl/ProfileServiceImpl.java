package b2b.rsatu.portalservice.service.impl;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.Profile;
import b2b.rsatu.portalservice.repository.ProfileRepository;
import b2b.rsatu.portalservice.service.ProfileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Resource
    private ProfileRepository profileRepository;

    @Override
    public Profile createProfileNewUser(PortalUser newUser) {
        Profile profile = new Profile();
        profile.setPortalUser(newUser);
        return profileRepository.save(profile);
    }
}
