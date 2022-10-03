package b2b.rsatu.portalservice.entity.reference;

import b2b.rsatu.portalservice.entity.Permission;
import b2b.rsatu.portalservice.entity.Profile;
import b2b.rsatu.portalservice.entity.base.BaseReferenceEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.AttributeOverride;
import javax.persistence.SequenceGenerator;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.util.List;

@Data
@Entity
@SequenceGenerator(name = "seq_gen", sequenceName = "USER_ROLE_ID_SEQ", allocationSize = 1)
@AttributeOverride(name="id", column = @Column(name="USER_ROLE_ID"))
@Table(name = "PORTAL_USER_ROLES")
public class UserRole extends BaseReferenceEntity {
    //todo With great power come also great responsibility
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = {})
    private List<Permission> permission;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {})
    @JoinColumn(name = "PROFILE_ID")
    private Profile profile;
}
