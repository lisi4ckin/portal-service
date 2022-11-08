package b2b.rsatu.portalservice.service.impl.portaluser;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.repository.UserRepository;
import b2b.rsatu.portalservice.service.portaluser.PortalUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PortalUserServiceImpl implements PortalUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public PortalUser getPortalUserByLogin(String userLogin) {
        return userRepository.findUserByLogin(userLogin);
    }

    @Override
    public PortalUser getPortalUserById(Long id) {
        return userRepository.getReferenceById(id);
    }
}
