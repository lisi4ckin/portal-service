package b2b.rsatu.portalservice.service.impl;

import b2b.rsatu.portalservice.entity.User;
import b2b.rsatu.portalservice.repository.UserRepository;
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

    @Override
    public User registrationUser(User newUser) {
        User user = userRepository.findUserByLogin(newUser.getLogin());

        String hashPassword = getHashPassword(newUser.getPassword());
        newUser.setPassword(hashPassword);

        if (user != null) {
            logger.warn("Operation=registrationUser, action=warn, message=User with this login already exist");
        } else {
            user = userRepository.save(newUser);
        }
        return user;
    }

    private String getHashPassword(String password) {
        return DigestUtils.md5Hex(password);
    }
}
