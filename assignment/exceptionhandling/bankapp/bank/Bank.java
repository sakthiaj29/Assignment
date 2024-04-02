package assignment.exceptionhandling.bankapp.bank;

import java.util.ArrayList;
import java.util.List;

import assignment.exceptionhandling.bankapp.account.Account;

public class Bank {

	private List<Account> accountList=new ArrayList<>();
	private String name = "ABC bank";
	private String address = "Tenkasi";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccount(Account account) {
		accountList.add(account);
	}

}
