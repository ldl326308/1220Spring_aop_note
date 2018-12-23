package com.nf.demo1.myDemo.dao;

import com.nf.demo1.myDemo.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CatDAO extends JpaRepository<Cat,Integer> {

    Cat findByName(String name);

    @Query("from Cat")
    List<Cat> getAll();

}
