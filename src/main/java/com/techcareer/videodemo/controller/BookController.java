package com.techcareer.videodemo.controller;

import com.techcareer.videodemo.data.request.CreateBookRequest;
import com.techcareer.videodemo.data.response.TCResponse;
import com.techcareer.videodemo.exception.BookException;
import com.techcareer.videodemo.exception.ErrorResponse;
import com.techcareer.videodemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("")
    public ResponseEntity<TCResponse<?>> createBook(@Valid @RequestBody CreateBookRequest createBookRequest){
        try {
            return ResponseEntity.ok(TCResponse.builder().isSuccess(true).response(bookService.createBook(createBookRequest)).build());
        }catch (BookException bookException){
            return ResponseEntity.ok(
                    TCResponse.<ErrorResponse>builder()
                            .isSuccess(false)
                            .response(new ErrorResponse(new ArrayList<>()))
                            .build());
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<TCResponse<?>> deleteBook(@PathVariable("id") String id){
        return ResponseEntity.ok(TCResponse.builder().build());
    }

    @PutMapping("{id}/author/change/{name}")
    public ResponseEntity<TCResponse<?>> updateNameOfAuthorByBook(@PathVariable("id") String id,@PathVariable("name") String name){
        return ResponseEntity.ok(TCResponse.builder().build());
    }

    @GetMapping()
    public ResponseEntity<TCResponse<?>> getAllBooks(){
        return ResponseEntity.ok(TCResponse.builder().build());
    }

    //Ekstra eklenecek endpointler

    // bir kitap author id ye göre çekilecek
    // bir kitabın adı ve yayınlanma yılı değiştirilecek. Patch request olacak. Sadece Request body kullanılacak
    // bir kitap silindiğinde yazarın başka kitabı yoksa yazarda silinecek
    //soft delete yapılmalı
}
