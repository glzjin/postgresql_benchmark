package com.example.postgresql_benchmark.dao;

import com.example.postgresql_benchmark.entity.TestEntity;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @author: jinzhao
 * @date:19/09/2018
 * @description:
 */
@Repository
public class TestDao extends NamedParameterJdbcTemplate {
    public TestDao(DataSource dataSource) {
        super(dataSource);
    }

    public void ins(TestEntity entity){
        update("insert into test(id,name) values (:id,:name)", new BeanPropertySqlParameterSource(entity));
    }

    public void select(){
        queryForList("select * from test", new HashMap());
    }
}
