package com.tdd.practice.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookStoreTest {

    @InjectMocks
    private BookStoreDAO bookStoreDAO;

    @Mock
    private BookStoreService bookStoreService;

    @Before
    public void setUp(){

    }

    @Test
    public void test() throws Exception{

    }


}
