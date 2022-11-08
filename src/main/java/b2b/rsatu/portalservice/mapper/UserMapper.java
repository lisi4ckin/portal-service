package b2b.rsatu.portalservice.mapper;

import b2b.rsatu.portalservice.dto.user.UserCreateRequestDto;
import b2b.rsatu.portalservice.dto.user.UserDto;
import b2b.rsatu.portalservice.entity.PortalUser;
import org.apache.commons.codec.digest.DigestUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.boot.context.properties.bind.Name;

@Mapper(componentModel = "spring",
        imports = {DigestUtils.class, String.class})
public interface UserMapper {

    @Named("basePortalUser")
    @Mapping(target = "id", expression = "java(DigestUtils.md5Hex(String.valueOf(portalUser.getId())))")
    @Mapping(target = "profileId", source = "profile.id")
    UserDto mapToDto(PortalUser portalUser);

    @Named("portalUserMapper")
    @Mapping(target = "login", source = "login")
    @Mapping(target = "password", source = "password")
    PortalUser mapToEntity(UserCreateRequestDto user);
}
