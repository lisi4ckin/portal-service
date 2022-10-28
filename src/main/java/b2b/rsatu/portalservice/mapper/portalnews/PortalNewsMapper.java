package b2b.rsatu.portalservice.mapper.portalnews;

import b2b.rsatu.portalservice.dto.portalnews.PortalNewsCreationBO;
import b2b.rsatu.portalservice.dto.portalnews.PortalNewsResponseDto;
import b2b.rsatu.portalservice.entity.news.PortalNews;
import b2b.rsatu.portalservice.mapper.UserMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring",
        uses = UserMapper.class)
public interface PortalNewsMapper {

    @Named("baseCreateMapper")
    @Mapping(target = "author", source = "author")
    PortalNews mapToEntity(PortalNewsCreationBO creationDto);

    @Named("responseNewsMapper")
    @Mapping(target = "categoryName", expression = "java((news.getNewsCategory() != null) ?" +
            "news.getNewsCategory().getName() : null)")
    @Mapping(target = "author", source = "author")
    PortalNewsResponseDto mapToResponseDto(PortalNews news);
}
