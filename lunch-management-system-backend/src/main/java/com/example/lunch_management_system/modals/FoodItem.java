package com.example.lunch_management_system.modals;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("food-item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {


    @Id
    @NonNull
    private String foodId;


    @NonNull
    private String Name;

    @NonNull
    private String type;


    @NonNull
    private String description;

    @NonNull
    private Integer price;
}
