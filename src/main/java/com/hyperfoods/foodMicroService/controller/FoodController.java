package com.hyperfoods.foodMicroService.controller;

import com.hyperfoods.foodMicroService.dto.UpdateFoodDTO;
import com.hyperfoods.foodMicroService.entity.Food;
import com.hyperfoods.foodMicroService.service.FoodService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService service;

    @PutMapping
    public ResponseEntity update(@RequestBody @Valid UpdateFoodDTO data) {
        return ResponseEntity.ok(service.update(new Food(data)));
    }
}
