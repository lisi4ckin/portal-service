package b2b.rsatu.portalservice.service;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.news.PortalNews;

import java.util.List;

public interface PortalNewsService {

    PortalNews createPortalNews(PortalNews newNews);

    PortalNews updatePortalNews(PortalNews updatePortalNews);

    List<PortalNews> getAuthorNews(PortalUser author);
}
