package com.example.simpleexpensetrackerbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simpleexpensetrackerbackend.model.Expense;
import com.example.simpleexpensetrackerbackend.repository.ExpenseRepository;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository repository;
    
    public Expense saveExpense(Expense expense){
        return repository.save(expense);
    }
    public Expense saveExpenses(Expense expenses){
    return repository.save(expenses);
    }
    public List<Expense> getExpenses(){
        return repository.findAll();
    }
    public Expense getExpensesById( String id){
        return repository.findById(id).orElse(null);
    }
    public String deleteExpense(String name){
        repository.deleteById(name);
        return "Expenses deleted of "+name;
    }
    public Expense updateExpense(Expense expense){
        Expense existingExpense=repository.findById(expense.getuser_name()).orElse(null);
       
        existingExpense.setBills(expense.getBills());
        existingExpense.setCloths(expense.getCloths());
        existingExpense.setElectronics(expense.getElectronics());
        existingExpense.setGrocery(expense.getGrocery());
        existingExpense.setIncome(expense.getIncome());
        existingExpense.setMedicine(expense.getMedicine());
        existingExpense.setOthers(expense.getOthers());
        return repository.save(existingExpense);
    }
    
}

