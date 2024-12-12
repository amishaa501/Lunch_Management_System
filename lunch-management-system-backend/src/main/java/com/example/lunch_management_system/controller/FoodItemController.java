package com.example.lunch_management_system.controller;


import com.example.lunch_management_system.modals.FoodItem;
import com.example.lunch_management_system.services.FoodItemService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodItemController {


    @Autowired
    private FoodItemService foodItemService;


    @PostMapping("addFoodItem")
    public ResponseEntity<?> addFoodItem(@RequestBody FoodItem foodItem){
        return foodItemService.addFoodItem(foodItem);
    }

    @GetMapping("/getFoodById")
    public ResponseEntity<?> getFoodById(@PathVariable String id){
        return new ResponseEntity<>(foodItemService.getFoodItemById(id), HttpStatus.OK);
    }

    @GetMapping("/getAllFoods")
    public List<FoodItem> getAllFoodItems(){
        return foodItemService.getAllFoodItem();
    }

    @DeleteMapping("/deleteFoodById")
    public String deleteFoodById(@PathVariable String id){
        return foodItemService.deletedFoodItem(id);
    }

}
