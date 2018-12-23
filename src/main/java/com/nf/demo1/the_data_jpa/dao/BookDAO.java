package com.nf.demo1.the_data_jpa.dao;

import com.nf.demo1.the_data_jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookDAO extends JpaRepository<Book, Integer> {
    Book findByNameAndPrice(String name, float price);
    List<Book> findByNameOrPrice(String name, float price);
    Book findByName(String name);

    @Query("from Book as s where s.name like 'w%'")
    Book findwoyebuzhidaozenmshuo();
}
