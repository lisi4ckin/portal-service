package b2b.rsatu.portalservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Data
@Table(name = "PORTAL_USERS")
public class User {

    @Id
    @Column(name = "PORTAL_USER_ID")
    @SequenceGenerator(name = "seq_gen", sequenceName = "PORTAL_USER_ID_SEQ")
    @GeneratedValue(generator = "seq_gen", strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USER_LOGIN", nullable = false)
    private String login;

    @Column(name = "USER_PASSWORD", nullable = false)
    private String password;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_PROFILE_ID")
    private Profile profile;
}
