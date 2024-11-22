package com.expTrackHibernate.expTrackHibernate.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expTrackHibernate.expTrackHibernate.entity.Expense;
import com.expTrackHibernate.expTrackHibernate.entity.Income;
import com.expTrackHibernate.expTrackHibernate.repository.ExpensesRepository;
import com.expTrackHibernate.expTrackHibernate.repository.IncomesRepository;

@Service
public class TransactionServiceImpl implements ItransactionService {

    @Autowired
    private IncomesRepository incomesRepository;

    @Autowired
    private ExpensesRepository expensesRepository;

    @Override
    public List<Income> getIncomes() {
        return incomesRepository.findAll();
        }

    @Override
    public List<Expense> getExpenses() {
        return expensesRepository.findAll();
       }

    @Override
    public Income addIncome(Income income) {
        return incomesRepository.saveAndFlush(income);
         }

    @Override
    public Expense addExpense(Expense expense) {
        System.out.println("Expense--------------------------------"+expense);
        return expensesRepository.save(expense);
         }

    @Override
    public String deleteIncome(int id) {
        incomesRepository.deleteAllByIdInBatch(List.of(Integer.valueOf(id)));
        return String.format("Ïncome with id : %s id deleted", id);
        }

    @Override
    public String deleteExpense(int id) {
        expensesRepository.deleteAllByIdInBatch(Arrays.asList(id));
        return String.format("Expense with id : %s id deleted", id);
        }

    @Override
    public String deleteIncomeByTitle(String title) {
        incomesRepository.deleteByTitle(title);
        return String.format("deleted income with title : %s", title);
        // return "";
    }
    
}
