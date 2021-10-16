package com.example.registrationForm.registrationform.repository;

import com.example.registrationForm.registrationform.domain.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<RegistrationForm,Integer> {
}
