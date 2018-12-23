package com.nf.demo1.the_data_jpa;

import com.nf.demo1.the_data_jpa.BookServcie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nf.demo1.the_data_jpa.entity.Book;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookServcie bean = context.getBean(BookServcie.class);
        List<Book> book = bean.listCond("jQuery", 121);

       // System.out.println(book1);
        //System.out.println(war_and_peace.getPrice());
    }
}
