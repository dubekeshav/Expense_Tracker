package com.expTrackHibernate.expTrackHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.expTrackHibernate.expTrackHibernate.entity.Expense;
import com.expTrackHibernate.expTrackHibernate.entity.Income;
import com.expTrackHibernate.expTrackHibernate.service.TransactionServiceImpl;

@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin(origins = "*", allowedHeaders = { "Authentication", "Content-type", "Origin" }, maxAge = 100)
@EnableJpaAuditing
public class TransactionController {

    @Autowired
    private TransactionServiceImpl transactionServiceImpl;

    @RequestMapping(method = RequestMethod.GET, value = "get-incomes")
    public ResponseEntity<List<Income>> getIncomes() {
        System.out.println("---------------------------8282");
        return new ResponseEntity<>(transactionServiceImpl.getIncomes(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "get-expenses")
    public ResponseEntity<List<Expense>> getExpenses() {
        return new ResponseEntity<>(transactionServiceImpl.getExpenses(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "add-income")
    public ResponseEntity<Income> addIncome(@RequestBody Income income){
        return new ResponseEntity<>(transactionServiceImpl.addIncome(income), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "add-expense")
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {
        return new ResponseEntity<>(transactionServiceImpl.addExpense(expense), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "delete-income/{income_id}")
    public ResponseEntity<String> deleteIncome(@PathVariable("income_id") int id) {
        return new ResponseEntity<>(transactionServiceImpl.deleteIncome(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "delete-expense/{expense_id}")
    public ResponseEntity<String> deleteExpense(@PathVariable("expense_id") int id) {
        return new ResponseEntity<>(transactionServiceImpl.deleteExpense(id), HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="delete-income-by-title/{income_title}")
    public ResponseEntity<String> deleteIncomeByTitle(@PathVariable("income_title") String title){
        return new ResponseEntity<>(transactionServiceImpl.deleteIncomeByTitle(title), HttpStatus.OK);
    }

}
