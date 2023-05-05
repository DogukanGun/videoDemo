package com.techcareer.videodemo.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Document("books")
public class Book extends BaseEntity{

    @NotNull
    private String name;
    @NotNull
    private String releaseYear;
    private String authorID;
}
