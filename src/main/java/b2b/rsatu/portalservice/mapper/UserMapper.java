package b2b.rsatu.portalservice.mapper;

import b2b.rsatu.portalservice.dto.UserDto;
import b2b.rsatu.portalservice.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto mapToDto(User user);
}
