package com.techcareer.videodemo.service;

import com.techcareer.videodemo.data.dto.BookDto;
import com.techcareer.videodemo.data.entity.Book;
import com.techcareer.videodemo.data.request.CreateBookRequest;
import com.techcareer.videodemo.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techcareer.videodemo.data.mapper.BookMapper.BOOK_MAPPER;

@Service
@RequiredArgsConstructor
public class BookService implements IBookInterface{

    private final BookEntityService bookEntityService;

    @Override
    public BookDto createBook(CreateBookRequest createBookRequest){
        Book book = BOOK_MAPPER.createBook(createBookRequest);
        book = bookEntityService.save(book);
        return BOOK_MAPPER.convertToBookDto(book);
    }
}
