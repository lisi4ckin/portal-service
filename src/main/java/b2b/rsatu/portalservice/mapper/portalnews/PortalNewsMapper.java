package b2b.rsatu.portalservice.mapper.portalnews;

import b2b.rsatu.portalservice.dto.portalnews.PortalNewsCreationBO;
import b2b.rsatu.portalservice.entity.news.PortalNews;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PortalNewsMapper {

    @Named("baseCreateMapper")
    PortalNews mapToEntity(PortalNewsCreationBO creationDto);
}
