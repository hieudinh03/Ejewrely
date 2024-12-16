package com.project.ejewelry.repositories;

import com.project.ejewelry.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
