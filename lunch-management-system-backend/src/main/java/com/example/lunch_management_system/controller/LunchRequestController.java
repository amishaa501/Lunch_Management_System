package com.example.lunch_management_system.controller;


import com.example.lunch_management_system.modals.LunchRequest;
import com.example.lunch_management_system.services.LunchRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LunchRequestController {

    @Autowired
    private LunchRequestService lunchRequestService;


    public ResponseEntity<?> addRequest(@RequestBody LunchRequest lunchRequest){
        return lunchRequestService.addRequest(lunchRequest);
    }

    public ResponseEntity<?> getAllRequests(){
        return lunchRequestService.getAllRequests();
    }
}
