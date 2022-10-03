package b2b.rsatu.portalservice.entity;

import b2b.rsatu.portalservice.entity.base.BaseEntity;
import b2b.rsatu.portalservice.entity.reference.UserRole;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Entity
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "PORTAL_USER_PERMISSION_ID")),
        @AttributeOverride(name = "name", column = @Column(name = "PERMISSION_NAME"))})
@Table(name = "PORTAL_USER_PERMISSION")
public class Permission extends BaseEntity {

    @Column(name = "PERMISSION_CODE")
    private String permissionCode;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {})
    @JoinColumn(name = "USER_ROLE_ID")
    private UserRole role;
}
