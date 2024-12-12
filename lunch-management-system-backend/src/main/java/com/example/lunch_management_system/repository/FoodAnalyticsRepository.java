package com.example.lunch_management_system.repository;

import com.example.lunch_management_system.modals.FoodAnalytics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodAnalyticsRepository extends MongoRepository<FoodAnalytics,String> {
}
