package com.application.mycourselibrary.repository;

import com.application.mycourselibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long>  {
}
