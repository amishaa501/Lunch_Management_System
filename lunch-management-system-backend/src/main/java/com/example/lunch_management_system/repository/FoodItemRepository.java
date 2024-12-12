package com.example.lunch_management_system.repository;

import com.example.lunch_management_system.modals.FoodItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends MongoRepository<FoodItem,String > {
}
