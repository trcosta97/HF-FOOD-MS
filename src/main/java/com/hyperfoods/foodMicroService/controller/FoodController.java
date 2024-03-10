package com.hyperfoods.foodMicroService.controller;

import com.hyperfoods.foodMicroService.dto.CreateFoodDTO;
import com.hyperfoods.foodMicroService.dto.UpdateFoodDTO;
import com.hyperfoods.foodMicroService.entity.Food;
import com.hyperfoods.foodMicroService.service.FoodService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService service;

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid CreateFoodDTO data, UriComponentsBuilder uriComponentsBuilder) {
        Food food = service.save(new Food(data));
        return ResponseEntity.created(uriComponentsBuilder.path("/food/{id}").buildAndExpand(food.getId()).toUri()).build();

    }

    @PutMapping
    public ResponseEntity update(@RequestBody @Valid UpdateFoodDTO data) {
        return ResponseEntity.ok(service.update(new Food(data)));
    }
}
