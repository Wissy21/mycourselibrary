package com.application.mycourselibrary.service.exceptions;

public class BorrowRecordNotFoundException extends RuntimeException {
    public BorrowRecordNotFoundException(Long id) {
        super(String.format("Borrow record with id '%d' not found", id));
    }
}
