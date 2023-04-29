package com.techcareer.videodemo.service;

import com.techcareer.videodemo.data.entity.Book;
import com.techcareer.videodemo.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookEntityService implements IBookEntityService{
    private final BookRepo bookRepo;

    @Override
    public Book save(Book book) {
        return bookRepo.save(book);
    }
}
