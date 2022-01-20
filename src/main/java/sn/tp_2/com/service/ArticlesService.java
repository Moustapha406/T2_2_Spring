package sn.tp_2.com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.tp_2.com.domain.Articles;
import sn.tp_2.com.repository.ArticlesRepository;

@Service
public class ArticlesService {

    @Autowired
    ArticlesRepository articlesRepository;

    public List<Articles> findAllArticles() {
        return articlesRepository.findAll();
    }
}
