package com.mysite.shoppingMall.repository;

import com.mysite.shoppingMall.dao.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
