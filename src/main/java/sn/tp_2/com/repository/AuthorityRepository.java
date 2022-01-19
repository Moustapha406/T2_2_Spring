package sn.tp_2.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.tp_2.com.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
