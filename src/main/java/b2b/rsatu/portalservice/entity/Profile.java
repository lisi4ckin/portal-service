package b2b.rsatu.portalservice.entity;

import b2b.rsatu.portalservice.entity.reference.UserGroup;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "PORTAL_USER_PROFILE")
public class Profile {

    @Id
    @SequenceGenerator(name = "seq_gen", sequenceName = "PORTAL_USER_PROFILE_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_gen")
    @Column(name = "USER_PROFILE_ID")
    private Long id;

    @Column(name = "USER_FULL_NAME")
    private String fullName;

    @Column(name = "DATE_OF_BIRTHDAY")
    private LocalDate birthday;

    @OneToOne(fetch = FetchType.LAZY, cascade = {})
    @JoinColumn(name = "GROUP_ID")
    private UserGroup group;

    @OneToOne(mappedBy = "profile")
    private User user;

}
