package com.main.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Product;

@EnableJpaRepositories
@Repository
public interface HomeRepository extends CrudRepository<Product, Integer> {

}
