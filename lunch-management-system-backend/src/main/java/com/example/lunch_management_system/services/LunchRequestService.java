package com.example.lunch_management_system.services;

import com.example.lunch_management_system.modals.LunchRequest;
import com.example.lunch_management_system.repository.LunchRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LunchRequestService {


    @Autowired
    private LunchRequestRepository lunchRequestRepository;

    public ResponseEntity<?> addRequest(LunchRequest lunchRequest){
        return new ResponseEntity<>(lunchRequestRepository.save(lunchRequest), HttpStatus.OK);
    }

    public ResponseEntity<?> getAllRequests(){
        return new ResponseEntity<>(lunchRequestRepository.findAll(),HttpStatus.OK);
    }
}
