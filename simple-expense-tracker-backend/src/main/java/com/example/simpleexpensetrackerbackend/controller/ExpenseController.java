package com.example.simpleexpensetrackerbackend.controller;


import java.util.List;
/*import java.util.Map;
import java.util.HashMap; */


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleexpensetrackerbackend.model.Expense;
//import com.example.simpleexpensetrackerbackend.repository.ExpenseRepository;
import com.example.simpleexpensetrackerbackend.service.ExpenseService;
//import com.example.simpleexpensetrackerbackend.exception.ResourceNotFoundException;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class ExpenseController {
    @Autowired
    private ExpenseService service;
    //private ExpenseRepository repository;
    

    @PostMapping("/addexpenses")
    public String addExpense(@RequestBody Expense expense){
         service.saveExpense(expense);
         return "Hi "+expense.getuser_name() + " your registration is completed";
    }
    @PostMapping("/expenses")
    public Expense addExpenses(@RequestBody Expense expenses){
        return service.saveExpenses(expenses);
    }
    @GetMapping("/expenses")
    public List<Expense> findAllExpenses(){
        return service.getExpenses();
    }
    @GetMapping("/expences/{name}")
    public Expense getExpenseById(@PathVariable String id){
        return service.getExpensesById(id);
    }
    
    @PutMapping("/expenses")
    public Expense updateExpense(@RequestBody Expense expense){
        return service.updateExpense(expense);
    }
     @DeleteMapping("/expenses/{name}")
     public String deleteExpense(@PathVariable String name){
        return service.deleteExpense(name);
     }
    // @DeleteMapping("/expenses/{id}")
    // public ResponseEntity<Map<String,Boolean>>deleteExpence(@PathVariable String id){
    //     Expense expense=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("expense not exist"+id));
    //     repository.delete(expense);
    //     Map<String,Boolean>response=new HashMap<>();
    //     response.put("deleted", Boolean.TRUE);
    //     return ResponseEntity.ok(response);
    // }


}
