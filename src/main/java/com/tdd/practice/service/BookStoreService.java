package com.tdd.practice.service;

import com.tdd.practice.domain.Book;

import java.util.List;

public interface BookStoreService {

    public List<Book> retrieveAllBooks() throws Exception;
}
