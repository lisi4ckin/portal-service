package b2b.rsatu.portalservice.entity.base;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;
}
