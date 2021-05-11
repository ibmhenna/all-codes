package com.ibm.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ibm.Account;

public class List1 {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account("Ram"+i, 100*i);
			accounts[i]=account;
		}
		accountList();
	}

	private static void accountList() {
		List<Account> accounts = new ArrayList<Account>();
		Account account1 = new Account("Ram1",5000);
		account1.setName("Ram");
		account1.setBalance(5010.0);
		accounts.add(account1);
		System.out.println(accounts);
		
		for (Iterator iterator = account1.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
	}

}
