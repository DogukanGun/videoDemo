package com.techcareer.videodemo.data.mapper;

import com.techcareer.videodemo.data.dto.BookDto;
import com.techcareer.videodemo.data.entity.Book;
import com.techcareer.videodemo.data.request.CreateBookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper BOOK_MAPPER = Mappers.getMapper(BookMapper.class);

    BookDto convertToBookDto(Book book);

    Book createBook(CreateBookRequest createBookRequest);
}
