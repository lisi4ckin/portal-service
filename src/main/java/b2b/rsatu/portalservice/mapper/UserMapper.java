package b2b.rsatu.portalservice.mapper;

import b2b.rsatu.portalservice.dto.UserCreateRequestDto;
import b2b.rsatu.portalservice.dto.UserDto;
import b2b.rsatu.portalservice.entity.PortalUser;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Named("basePortalUser")
    UserDto mapToDto(PortalUser portalUser);

    @Mapping(target = "login", source = "login")
    @Mapping(target = "password", source = "password")
    PortalUser mapToEntity(UserCreateRequestDto user);
}
