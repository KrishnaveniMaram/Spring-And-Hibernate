package com.bankapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.persistance.Account;
import com.bankapp.model.persistance.AccountDao;

@Service(value="accountService")
public class AccountServiceImpl implements AccountService {
private AccountDao dao;


public void setDao(AccountDao dao) {
	this.dao = dao;
}

@Autowired
public AccountServiceImpl(AccountDao dao) {
	super();
	this.dao = dao;
}
@Override
	public List<Account>getAllAccounts() {
		// TODO Auto-generated method stub
		return dao.getAllAccounts();
	}

	@Override
	public Account getAccount(int id) {
		// TODO Auto-generated method stub
		return dao.find(id);
	}

	@Override
	public void transfer(int fromAccount, int toAccount, int amount) {
		// TODO Auto-generated method stub
		Account fromAcc =dao.find(fromAccount);
		Account toAcc=dao.find(toAccount);
		fromAcc.setBalance(fromAcc.getBalance()-amount);
		toAcc.setBalance(toAcc.getBalance()+amount);
		dao.update(fromAcc);
		dao.update(toAcc);
	}

	@Override
	public void deposit(int accountId, int amount) {
		// TODO Auto-generated method stub
		
		Account acc=dao.find(accountId);
		acc.setBalance(acc.getBalance()+amount);
		dao.update(acc);
	}

	@Override
	public void withdraw(int accountId, int amount) {
		// TODO Auto-generated method stub
		Account acc=dao.find(accountId);
		acc.setBalance(acc.getBalance()-amount);
		dao.update(acc);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
