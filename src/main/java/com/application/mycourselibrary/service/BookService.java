package com.application.mycourselibrary.service;

import com.application.mycourselibrary.entity.Book;
import com.application.mycourselibrary.repository.BookRepository;
import com.application.mycourselibrary.service.exceptions.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    public void createBook(Book book){
        bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
        book.setName(bookDetails.getName());
        book.setAuthors(bookDetails.getAuthors());
        book.setIsbn(bookDetails.getIsbn());
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
        bookRepository.deleteById(book.getId());
    }

    public List<Book> getAvailableBooks() {
        return bookRepository.findByAvailable(true);
    }
}
