package b2b.rsatu.portalservice.service.impl;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.news.PortalNews;
import b2b.rsatu.portalservice.repository.news.PortalNewsRepository;
import b2b.rsatu.portalservice.service.PortalNewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PortalNewsServiceImpl implements PortalNewsService {

    @Resource
    private PortalNewsRepository newsRepository;

    @Override
    public PortalNews createPortalNews(PortalNews newNews) {
        return newsRepository.save(newNews);
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
