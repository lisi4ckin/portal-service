package b2b.rsatu.portalservice.repository.base;

import b2b.rsatu.portalservice.entity.base.BaseReferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseReferenceRepository<E extends BaseReferenceEntity> extends JpaRepository<E, Long> {

}
