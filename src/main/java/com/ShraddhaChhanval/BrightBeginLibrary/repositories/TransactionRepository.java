package com.ShraddhaChhanval.BrightBeginLibrary.repositories;

import com.ShraddhaChhanval.BrightBeginLibrary.models.Transaction;
import com.ShraddhaChhanval.BrightBeginLibrary.models.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    // sort on the basis of time to get the latest issual date
    @Query("select t from Transaction t where t.card.id=:cardId and t.book.id=:bookId and t.isIssueOperation=:isIssue and t.transactionStatus=:status")
    public List<Transaction> find(int cardId, int bookId, TransactionStatus status, boolean isIssue);
}