package com.application.mycourselibrary.repository;

import com.application.mycourselibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository <Book, Long>  {
    List<Book> findByAvailable(boolean available);
}
