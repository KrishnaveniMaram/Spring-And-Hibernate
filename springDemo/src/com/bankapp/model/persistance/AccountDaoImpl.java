package com.bankapp.model.persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountDaoImpl  implements AccountDao{
	
	private Map<Integer, Account> map=new HashMap<Integer,Account>();
	public AccountDaoImpl() 
	{
		map.put(1, new Account(1,"bharu",100));
		map.put(2, new Account(2,"kittu",101));
	}
	
	public List<Account>getAllAccounts(){
		
	
		return new ArrayList<Account>(map.values());
		
	}
	
	public void update(Account account){
		map.put(account.getId(), account);
		
	}
	
	
	
	public Account find(int id){
		return map.get(id);
		
	}
	
	
	
}
