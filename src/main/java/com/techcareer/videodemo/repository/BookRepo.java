package com.techcareer.videodemo.repository;

import com.techcareer.videodemo.data.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepo extends MongoRepository<Book,String> {
    Optional<Book> findByAuthorID(String authorId);
    Optional<List<Book>> findAllByIsDeletedFalse();
}
