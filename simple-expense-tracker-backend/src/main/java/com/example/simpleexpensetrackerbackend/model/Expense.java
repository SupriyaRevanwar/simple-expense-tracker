package com.example.simpleexpensetrackerbackend.model;

import jakarta.persistence.Column;  
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;
import lombok.Data;  
//mark class as an Entity 
@Data  
@Entity  
//defining class name as Table name  
@Table(name = "usersweb") 
public class Expense  
{  
//Defining name as primary key  
@Id  
@Column(name = "user_name")  
private String user_name;

@Column(name = "income")  
private int income;

@Column(name = "grocery")  
private int grocery; 

@Column(name = "electronics") 
private int electronics; 

@Column(name = "bills")
private int bills;

@Column(name = "cloths")
private int cloths;

@Column(name = "medicine")
private int medicine;

@Column(name = "others")
private int others; 

//constructors
public Expense(){}


public Expense(String user_name, int income, int grocery, int electronics, int bills, int cloths, int medicine,
        int others) {
    this.user_name = user_name;
    this.income = income;
    this.grocery = grocery;
    this.electronics = electronics;
    this.bills = bills;
    this.cloths = cloths;
    this.medicine = medicine;
    this.others = others;
}


public String getuser_name() {
    return user_name;
}
public void setuser_name(String user_name) {
    this.user_name = user_name;
}
public int getIncome() {
    return income;
}
public void setIncome(int income) {
    this.income = income;
}
public int getGrocery() {
    return grocery;
}
public void setGrocery(int grocery) {
    this.grocery = grocery;
}
public int getElectronics() {
    return electronics;
}
public void setElectronics(int electronics) {
    this.electronics = electronics;
}
public int getBills() {
    return bills;
}
public void setBills(int bills) {
    this.bills = bills;
}
public int getCloths() {
    return cloths;
}
public void setCloths(int cloths) {
    this.cloths = cloths;
}
public int getMedicine() {
    return medicine;
}
public void setMedicine(int medicine) {
    this.medicine = medicine;
}
public int getOthers() {
    return others;
}
public void setOthers(int others) {
    this.others = others;
}


@Override
public String toString() {
    return "Expense [user_name=" + user_name + ", income=" + income + ", grocery=" + grocery + ", electronics="
            + electronics + ", bills=" + bills + ", cloths=" + cloths + ", medicine=" + medicine + ", others=" + others
            + "]";
}

}  

