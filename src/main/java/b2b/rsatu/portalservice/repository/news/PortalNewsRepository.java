package b2b.rsatu.portalservice.repository.news;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.news.PortalNews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortalNewsRepository extends JpaRepository<PortalNews, Long> {

    List<PortalNews> findAllByAuthor(PortalUser author);
}
