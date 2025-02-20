package com.skillnest.alejandroE.repositories;


import com.skillnest.alejandroE.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //Consultas personalizadas

    Product findByName(String name);

    // SELECT * FROM products WHERE description LIKE "%<word>"
    List<Product> findByDescriptionContaining(String word);

    // con query nativo @Query -  @NativeQuery

}
