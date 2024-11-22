package com.expTrackHibernate.expTrackHibernate.service;

import java.util.List;

import com.expTrackHibernate.expTrackHibernate.entity.Expense;
import com.expTrackHibernate.expTrackHibernate.entity.Income;

public interface ItransactionService {

    public List<Income> getIncomes();

    public List<Expense> getExpenses();

    public Income addIncome(Income income);

    public Expense addExpense(Expense expense);

    public String deleteIncome(int id);

    public String deleteExpense(int id);

    public String deleteIncomeByTitle(String title);
    
}
