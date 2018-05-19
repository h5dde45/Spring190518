package com.caching_data;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
