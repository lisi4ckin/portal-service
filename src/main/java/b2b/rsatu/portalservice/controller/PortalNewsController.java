package b2b.rsatu.portalservice.controller;

import b2b.rsatu.portalservice.dto.portalnews.PortalNewsCreationBO;
import b2b.rsatu.portalservice.dto.portalnews.PortalNewsResponseBO;
import b2b.rsatu.portalservice.service.news.PortalNewsControllerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/news")
public class PortalNewsController {

    @Resource
    private PortalNewsControllerService newsControllerService;

    @PostMapping
    public ResponseEntity<PortalNewsResponseBO> createNews(@RequestBody PortalNewsCreationBO newNews) {
        return new ResponseEntity<>(newsControllerService.createNews(newNews), HttpStatus.OK);
    }
}
