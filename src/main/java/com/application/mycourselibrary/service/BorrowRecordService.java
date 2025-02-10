package com.application.mycourselibrary.service;

import com.application.mycourselibrary.entity.BorrowRecord;
import com.application.mycourselibrary.entity.Member;
import com.application.mycourselibrary.repository.BorrowRecordRepository;
import com.application.mycourselibrary.repository.MemberRepository;
import com.application.mycourselibrary.service.exceptions.BorrowRecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowRecordService {

    @Autowired
    private BorrowRecordRepository recordRepository;

    public BorrowRecordService(BorrowRecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public BorrowRecord updateBorrowRecord(Long id, BorrowRecord recordDetails) {
        BorrowRecord record = recordRepository.findById(id).orElseThrow(() -> new BorrowRecordNotFoundException(id));
        record.setBook(recordDetails.getBook());
        record.setMember(recordDetails.getMember());
        record.setBorrowDate(recordDetails.getBorrowDate());
        record.setReturnDate(recordDetails.getReturnDate());
        return recordRepository.save(record);
    }
    public void deleteBorrowRecord(Long id){
        recordRepository.findById(id).ifPresentOrElse(
                record -> recordRepository.deleteById(record.getId()),
                () -> {throw new BorrowRecordNotFoundException(id);}
        );
    }

    public BorrowRecord findBorrowRecordById(Long id) {
        return recordRepository.findById(id).orElseThrow(() -> new BorrowRecordNotFoundException(id));
    }

    public BorrowRecord createBorrowRecord(BorrowRecord borrowRecord) {
        return recordRepository.save(borrowRecord);
    }
}
