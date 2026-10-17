package com.database.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="tablename")
public class DBEntity 
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
     @Column(name="name")
    private String name;
     @Column(name="number", unique = true)
    private int number;
     public int getId() {
         return id;
     }
     public void setId(int id) {
         this.id = id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public int getNumber() {
         return number;
     }
     public void setNumber(int number) {
         this.number = number;
     }
     public DBEntity(String name, int number) {
        this.name = name;
        this.number = number;
     }
     public DBEntity() {
     }
    
}
