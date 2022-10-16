package b2b.rsatu.portalservice.repository;

import b2b.rsatu.portalservice.entity.PortalUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<PortalUser, Long> {

    PortalUser findUserByLogin(String login);
}
