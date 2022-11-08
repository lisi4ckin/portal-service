package b2b.rsatu.portalservice.service.impl.news;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.news.PortalNews;
import b2b.rsatu.portalservice.repository.news.PortalNewsRepository;
import b2b.rsatu.portalservice.service.news.PortalNewsService;
import b2b.rsatu.portalservice.service.portaluser.PortalUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PortalNewsServiceImpl implements PortalNewsService {

    @Resource
    private PortalNewsRepository newsRepository;

    @Resource
    private PortalUserService userService;

    @Override
    public PortalNews createPortalNews(PortalNews newNews) {
        newNews.setCreationDate(LocalDateTime.now());
        return newsRepository.saveAndFlush(newNews);
    }

    @Override
    public PortalNews updatePortalNews(PortalNews updatePortalNews) {
        return null;
    }

    @Override
    public List<PortalNews> getAuthorNews(PortalUser author) {
        return newsRepository.findAllByAuthor(author);
    }
}
