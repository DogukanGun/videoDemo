package com.techcareer.videodemo.service;

import com.techcareer.videodemo.data.dto.BookDto;
import com.techcareer.videodemo.data.request.CreateBookRequest;

public interface IBookInterface {
    BookDto createBook(CreateBookRequest createBookRequest);
}
