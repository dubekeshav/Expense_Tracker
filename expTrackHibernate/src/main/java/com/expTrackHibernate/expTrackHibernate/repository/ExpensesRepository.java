package com.expTrackHibernate.expTrackHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expTrackHibernate.expTrackHibernate.entity.Expense;

@Repository
public interface ExpensesRepository extends JpaRepository<Expense, Integer> {
    
}
