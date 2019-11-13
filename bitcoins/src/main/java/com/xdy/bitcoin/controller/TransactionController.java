package com.xdy.bitcoin.controller;

import com.xdy.bitcoin.dao.TransactionMapper;
import com.xdy.bitcoin.po.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {

    @Resource
    private TransactionMapper transactionMapper;

    @GetMapping("/transaction")
    public List<Transaction> Transaction(){
        List<Transaction> transaction= transactionMapper.Transaction();
        return transaction;
    }
}
