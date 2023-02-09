package com.ShraddhaChhanval.BrightBeginLibrary.services;

import com.ShraddhaChhanval.BrightBeginLibrary.models.Author;
import com.ShraddhaChhanval.BrightBeginLibrary.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public void create(Author author){
        authorRepository.save(author);
    }
}