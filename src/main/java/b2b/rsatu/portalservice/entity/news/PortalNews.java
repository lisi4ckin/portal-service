package b2b.rsatu.portalservice.entity.news;

import b2b.rsatu.portalservice.entity.PortalUser;
import b2b.rsatu.portalservice.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PORTAL_NEWS")
@AttributeOverride(name = "id", column = @Column(name = "NEWS_ID"))
public class PortalNews extends BaseEntity {

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHOR_ID")
    private PortalUser author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NEWS_CATEGORY_ID")
    private PortalNewsCategory newsCategory;

}
