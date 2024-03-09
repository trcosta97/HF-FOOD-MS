package com.hyperfoods.foodMicroService.dto;

import com.hyperfoods.foodMicroService.entity.FoodType;

import java.math.BigDecimal;

public record UpdateFoodDTO(
        String name,
        String description,
        BigDecimal price,
        FoodType type


) {
}
