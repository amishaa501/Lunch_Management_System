package com.example.lunch_management_system.modals;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document("food-analytics")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodAnalytics {

    @Id
    @NonNull
    private String analyticsId;

    @NonNull
    private String adminId;

    @NonNull
    private Date date;

    @NonNull
    private Integer totalRequests;




}
