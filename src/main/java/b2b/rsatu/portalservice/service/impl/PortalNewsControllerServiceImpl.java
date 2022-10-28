package b2b.rsatu.portalservice.service.impl;

import b2b.rsatu.portalservice.dto.portalnews.PortalNewsCreationBO;
import b2b.rsatu.portalservice.dto.portalnews.PortalNewsResponseBO;
import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.news.PortalNews;
import b2b.rsatu.portalservice.mapper.portalnews.PortalNewsMapper;
import b2b.rsatu.portalservice.service.PortalNewsControllerService;
import b2b.rsatu.portalservice.service.PortalNewsService;
import b2b.rsatu.portalservice.service.PortalUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PortalNewsControllerServiceImpl implements PortalNewsControllerService {

    @Resource
    private PortalNewsMapper newsMapper;

    @Resource
    private PortalUserService userService;

    @Resource
    private PortalNewsService newsService;

    @Override
    public PortalNewsResponseBO createNews(PortalNewsCreationBO news) {
        PortalNews newNews = newsMapper.mapToEntity(news);
        PortalUser author = userService.getPortalUserByLogin(news.getAuthorLogin());
        newNews.setAuthor(author);
        newsService.createPortalNews(newNews);
        return newsMapper.mapToResponseBO(newNews);
    }
}
