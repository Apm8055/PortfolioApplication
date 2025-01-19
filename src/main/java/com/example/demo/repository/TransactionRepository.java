package com.example.demo.repository;


import com.example.demo.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

    @Query("SELECT t FROM TransactionEntity t WHERE t.userId = :abc")
    List<TransactionEntity> findTransactionByUserID(@Param("abc") long userId);

}

