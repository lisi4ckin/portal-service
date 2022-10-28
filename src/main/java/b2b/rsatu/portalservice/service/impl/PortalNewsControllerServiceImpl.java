package b2b.rsatu.portalservice.service.impl;

import b2b.rsatu.portalservice.dto.portalnews.PortalNewsCreationBO;
import b2b.rsatu.portalservice.dto.portalnews.PortalNewsResponseDto;
import b2b.rsatu.portalservice.entity.news.PortalNews;
import b2b.rsatu.portalservice.mapper.portalnews.PortalNewsMapper;
import b2b.rsatu.portalservice.service.PortalNewsControllerService;
import b2b.rsatu.portalservice.service.PortalNewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PortalNewsControllerServiceImpl implements PortalNewsControllerService {

    @Resource
    private PortalNewsMapper newsMapper;

    @Resource
    private PortalNewsService newsService;

    @Override
    public PortalNewsResponseDto createNews(PortalNewsCreationBO news) {
        PortalNews newNews = newsMapper.mapToEntity(news);
        newsService.createPortalNews(newNews);
        return newsMapper.mapToResponseDto(newNews);
    }
}