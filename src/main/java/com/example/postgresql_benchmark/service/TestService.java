package com.example.postgresql_benchmark.service;

import com.example.postgresql_benchmark.dao.TestDao;
import com.example.postgresql_benchmark.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: jinzhao
 * @date:19/09/2018
 * @description:
 */
@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public void insert(Integer loop){
        TestEntity entity = new TestEntity();
        for (int i = 0;i<loop;i++){
            entity.setName("测试");
            entity.setId(i);
            testDao.ins(entity);
        }
    }

    public void select(){
        testDao.select();
    }
}
