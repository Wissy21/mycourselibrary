package com.application.mycourselibrary.repository;

import com.application.mycourselibrary.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
