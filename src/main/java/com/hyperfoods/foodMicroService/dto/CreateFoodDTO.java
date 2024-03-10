package com.hyperfoods.foodMicroService.dto;

import com.hyperfoods.foodMicroService.entity.FoodType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record CreateFoodDTO(
        @NotBlank
        String name,
        @NotBlank
        String description,
        @NotNull
        BigDecimal price,
        @NotBlank
        FoodType type,
        @NotNull
        Long restaurantId


) {
}
