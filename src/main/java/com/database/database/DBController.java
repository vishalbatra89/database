package com.database.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/database")
@RestController 
public class DBController 
{
    @Autowired 
    DBRepository db;

    @PostMapping("/save")
    public DBEntity save(@RequestBody DBEntity d) 
    {
        return db.save(d);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id)
    {
        db.deleteById(id);
        return "";
    }    


}
