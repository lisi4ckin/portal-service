package b2b.rsatu.portalservice.service.portaluser.profile;

import b2b.rsatu.portalservice.dto.profile.ProfileCreateRequestDto;
import b2b.rsatu.portalservice.dto.profile.ProfileDto;

public interface ProfileControllerService {

    ProfileDto updateUserProfile(ProfileCreateRequestDto updateProfile, Long userId);

    ProfileDto getProfileById(Long id);
}
