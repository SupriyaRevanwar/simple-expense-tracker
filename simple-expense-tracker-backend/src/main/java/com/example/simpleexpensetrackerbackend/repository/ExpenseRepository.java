package com.example.simpleexpensetrackerbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simpleexpensetrackerbackend.model.Expense;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense,String>{

    
}
