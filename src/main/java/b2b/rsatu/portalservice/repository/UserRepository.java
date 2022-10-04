package b2b.rsatu.portalservice.repository;

import b2b.rsatu.portalservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByLogin(String login);
}
