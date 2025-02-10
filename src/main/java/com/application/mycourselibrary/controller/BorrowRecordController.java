package com.application.mycourselibrary.controller;

import com.application.mycourselibrary.entity.BorrowRecord;
import com.application.mycourselibrary.service.BorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BorrowRecordController {

    @Autowired
    private BorrowRecordService borrowRecordService;

    @PutMapping("/borrow-record/{id}")
    public BorrowRecord updateBorrowRecord(@PathVariable Long id, @RequestBody BorrowRecord borrowRecordDetails) {
        return borrowRecordService.updateBorrowRecord(id, borrowRecordDetails);
    }

    @DeleteMapping("/borrow-record/{id}")
    public void deleteBorrowRecord(@PathVariable Long id) {
        borrowRecordService.deleteBorrowRecord(id);
    }

    @GetMapping("/borrow-record/{id}")
    public BorrowRecord findBorrowRecord(@PathVariable Long id) {
        return borrowRecordService.findBorrowRecordById(id);
    }

    @PostMapping("/borrow-record")
    public BorrowRecord createBorrowRecord(@RequestBody BorrowRecord borrowRecord) {
        return borrowRecordService.createBorrowRecord(borrowRecord);
    }
}
