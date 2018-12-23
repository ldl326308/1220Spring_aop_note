package com.nf.demo.myDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CatDAO {

    @Autowired
    private JdbcOperations jdbcOperations;

    /**
     * 查询所有数据
     *
     * @return
     */
    public List<Map<String, Object>> selectAll() {
        List<Map<String, Object>> maps = jdbcOperations.queryForList("select * from cat");
        return maps;
    }

    /**
     * 添加一只猫
     * @param cat
     * @return
     */
    public boolean insertCat(Cat cat) {
        String sql = "insert into cat(name,age,`describe`) values(?,?,?)";
        int update = jdbcOperations.update(sql, cat.getName(), cat.getAge(), cat.getDescribe());
        return update > 0;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Map<String, Object> selectById(int id){
        String sql = "select * from cat where id = ? ";
        Map<String, Object> stringObjectMap = jdbcOperations.queryForMap(sql, 1);
        return stringObjectMap;
    }




}
