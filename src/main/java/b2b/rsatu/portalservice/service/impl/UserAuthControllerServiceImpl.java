package b2b.rsatu.portalservice.service.impl;

import b2b.rsatu.portalservice.dto.UserCreateRequestDto;
import b2b.rsatu.portalservice.dto.UserDto;
import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.mapper.UserMapper;
import b2b.rsatu.portalservice.service.UserAuthControllerService;
import b2b.rsatu.portalservice.service.UserAuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserAuthControllerServiceImpl implements UserAuthControllerService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserAuthService authService;

    @Override
    public UserDto registrationUser(UserCreateRequestDto newUser) {
        PortalUser portalUser = userMapper.mapToEntity(newUser);
        authService.registrationUser(portalUser);
        return userMapper.mapToDto(portalUser);
    }
}
