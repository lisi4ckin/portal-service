package b2b.rsatu.portalservice.service.impl;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.repository.UserRepository;
import b2b.rsatu.portalservice.service.ProfileService;
import b2b.rsatu.portalservice.service.UserAuthService;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    private static final Logger logger = LoggerFactory.getLogger(UserAuthServiceImpl.class);
    @Resource
    private UserRepository userRepository;

    @Resource
    private ProfileService profileService;

    @Override
    public PortalUser registrationUser(PortalUser newPortalUser) {
        PortalUser portalUser = userRepository.findUserByLogin(newPortalUser.getLogin());

        String hashPassword = getHashPassword(newPortalUser.getPassword());
        newPortalUser.setPassword(hashPassword);

        if (portalUser != null) {
            logger.warn("Operation=registrationUser, action=warn, message=User with this login already exist");
        } else {
            portalUser = userRepository.save(newPortalUser);
            portalUser.setProfile(profileService.createProfileNewUser(newPortalUser));
            userRepository.save(newPortalUser);
            logger.info("Operation=registrationUser, action=end");
        }
        return portalUser;
    }

    private String getHashPassword(String password) {
        return DigestUtils.md5Hex(password);
    }
}
