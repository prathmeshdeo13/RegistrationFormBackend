package com.example.registrationForm.registrationform.controller;

import com.example.registrationForm.registrationform.domain.RegistrationForm;
import com.example.registrationForm.registrationform.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/registration")
@CrossOrigin("*")
public class RegistrationController {

    @Autowired
    private RegistrationRepo registrationRepo;

    @PostMapping(value = "/saveRegistration")
    public ResponseEntity<?> saveRegistration(@RequestBody RegistrationForm registrationForm) {
        try {
            return new ResponseEntity<>(registrationRepo.save(registrationForm), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Not Saved Successfully", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getRegistration")
    public ResponseEntity<?> getRegistration() {
        try {
            return new ResponseEntity<>(registrationRepo.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Not Fetched Successfully", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
