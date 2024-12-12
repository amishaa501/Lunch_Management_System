package com.example.lunch_management_system.modals;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employee-details")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {


    @Id
    @NonNull
    private String empId;


    @NonNull
    private String name;

    @NonNull
    private String email;

    @NonNull
    private String password;

    @NonNull
    private String role;

    @NonNull
    private String phoneNo;



}
