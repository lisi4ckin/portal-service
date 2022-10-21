package b2b.rsatu.portalservice.entity.news;

import b2b.rsatu.portalservice.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PORTAL_NEWS_CATEGORIES")
@AttributeOverride(name = "id", column = @Column(name = "NEWS_CATEGORY_ID"))
public class PortalNewsCategory extends BaseEntity {

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;
}
