package com.example.postgresql_benchmark.service;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void Ainsert() {
        testService.insert(100000);
    }

    @Test
    public void Bselect() {
        testService.select();
    }
}