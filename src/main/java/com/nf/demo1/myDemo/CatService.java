package com.nf.demo1.myDemo;

import com.nf.demo1.myDemo.dao.CatDAO;
import com.nf.demo1.myDemo.entity.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    @Autowired
    private CatDAO catDAO;

    public Cat findByName(String name){
        return catDAO.findByName(name);
    }


    public List<Cat> getAll(){
        return catDAO.getAll();
    }

}
