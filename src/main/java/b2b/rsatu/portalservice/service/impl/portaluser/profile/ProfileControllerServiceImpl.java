package b2b.rsatu.portalservice.service.impl.portaluser.profile;

import b2b.rsatu.portalservice.dto.profile.ProfileCreateRequestDto;
import b2b.rsatu.portalservice.dto.profile.ProfileDto;
import b2b.rsatu.portalservice.entity.Profile;
import b2b.rsatu.portalservice.mapper.profile.ProfileMapper;
import b2b.rsatu.portalservice.service.portaluser.profile.ProfileControllerService;
import b2b.rsatu.portalservice.service.portaluser.profile.ProfileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("profileControllerService")
public class ProfileControllerServiceImpl implements ProfileControllerService {

    @Resource
    private ProfileService profileService;

    @Resource
    private ProfileMapper profileMapper;

    @Override
    public ProfileDto updateUserProfile(ProfileCreateRequestDto updateProfile, Long userId) {
        Profile updateUserProfile = profileMapper.mapToDto(updateProfile);
        updateUserProfile = profileService.updateUserProfile(updateUserProfile, userId);
        return profileMapper.mapToDto(updateUserProfile);
    }

    @Override
    public ProfileDto getProfileById(Long id) {
        ProfileDto result = profileMapper.mapToDto(profileService.getProfile(id));
        return result;
    }
}
