package b2b.rsatu.portalservice.mapper.profile;

import b2b.rsatu.portalservice.dto.profile.ProfileDto;
import b2b.rsatu.portalservice.entity.Profile;
import b2b.rsatu.portalservice.mapper.UserMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        uses = {UserMapper.class}
)
public interface ProfileMapper {

    @Mapping(target = "portalUser", source = "portalUser", qualifiedByName = "basePortalUser")
    ProfileDto mapToDto(Profile userProfile);
}
