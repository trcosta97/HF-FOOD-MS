package com.hyperfoods.foodMicroService.repository;

import com.hyperfoods.foodMicroService.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
