package ma.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{

}


