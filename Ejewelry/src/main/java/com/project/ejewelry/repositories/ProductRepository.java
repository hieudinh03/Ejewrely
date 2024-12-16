package com.project.ejewelry.repositories;

import com.project.ejewelry.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.*;

public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsByName(String name);
    Page<Product> findAll(Pageable pageable);//phân trang
}
