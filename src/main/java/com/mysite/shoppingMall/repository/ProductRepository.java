package com.mysite.shoppingMall.repository;

import com.mysite.shoppingMall.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
