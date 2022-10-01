package b2b.rsatu.portalservice.entity.reference;

import b2b.rsatu.portalservice.entity.Profile;
import b2b.rsatu.portalservice.entity.base.BaseReferenceEntity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.SequenceGenerator;
import javax.persistence.AttributeOverride;
import javax.persistence.OneToOne;

@Data
@Entity
@Table(name = "USER_GROUPS")
@SequenceGenerator(name = "seq_gen", sequenceName = "USER_GROUP_ID_SEQ")
@AttributeOverride(name = "id", column = @Column(name = "GROUP_ID"))
public class UserGroup extends BaseReferenceEntity {

    @OneToOne(mappedBy = "group")
    private Profile profile;
}
