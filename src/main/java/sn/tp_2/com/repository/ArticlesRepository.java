package sn.tp_2.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.tp_2.com.domain.Articles;

@Repository
public interface ArticlesRepository extends JpaRepository<Articles, Long> {}
