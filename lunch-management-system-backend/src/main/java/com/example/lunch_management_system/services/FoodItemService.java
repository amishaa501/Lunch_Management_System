package com.example.lunch_management_system.services;


import com.example.lunch_management_system.modals.FoodItem;
import com.example.lunch_management_system.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.geom.RectangularShape;
import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;


    public ResponseEntity<?> addFoodItem(FoodItem foodItem){
        return new ResponseEntity<>(foodItemRepository.save(foodItem), HttpStatus.OK);
    }

    public List<FoodItem> getAllFoodItem(){
        return foodItemRepository.findAll();
    }

    public ResponseEntity<?> getFoodItemById(String id){
        return new ResponseEntity<>(foodItemRepository.findById(id), HttpStatus.OK);
    }

    public String deletedFoodItem(String id){
        if(foodItemRepository.existsById(id)){
            foodItemRepository.deleteById(id);
            return "Food item is sucessfully deleted...";
        }
        else{
            throw new RuntimeException("The food item with such id does not exists ....");
        }
    }
}
