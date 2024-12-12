package com.example.lunch_management_system.modals;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("lunch-request")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LunchRequest {

    @Id
//    @Indexed(unique = true)
    @NonNull
    private String requestId;

    @NonNull
    private String empId;

    @NonNull
    private Date date;

    @NonNull
    private boolean status;

    @NonNull
    private Integer token;

}
