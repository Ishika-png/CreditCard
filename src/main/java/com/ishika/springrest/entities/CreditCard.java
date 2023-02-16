package com.ishika.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditCard {

	@Id
	private Long accountId;
	
	private int customer_id;
	private int account_limit;
	private int per_transaction_limit;
	private int last_account_limit;
	private int last_per_transaction_limit;
	private int account_limit_update_time;
	private int per_transaction_limit_update_time;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getAccount_limit() {
		return account_limit;
	}
	public void setAccount_limit(int account_limit) {
		this.account_limit = account_limit;
	}
	public int getPer_transaction_limit() {
		return per_transaction_limit;
	}
	public void setPer_transaction_limit(int per_transaction_limit) {
		this.per_transaction_limit = per_transaction_limit;
	}
	public int getLast_account_limit() {
		return last_account_limit;
	}
	public void setLast_account_limit(int last_account_limit) {
		this.last_account_limit = last_account_limit;
	}
	public int getLast_per_transaction_limit() {
		return last_per_transaction_limit;
	}
	public void setLast_per_transaction_limit(int last_per_transaction_limit) {
		this.last_per_transaction_limit = last_per_transaction_limit;
	}
	public int getAccount_limit_update_time() {
		return account_limit_update_time;
	}
	public void setAccount_limit_update_time(int account_limit_update_time) {
		this.account_limit_update_time = account_limit_update_time;
	}
	public int getPer_transaction_limit_update_time() {
		return per_transaction_limit_update_time;
	}
	public void setPer_transaction_limit_update_time(int per_transaction_limit_update_time) {
		this.per_transaction_limit_update_time = per_transaction_limit_update_time;
	}
	@Override
	public String toString() {
		return "CreditCard [accountId=" + accountId + ", customer_id=" + customer_id + ", account_limit="
				+ account_limit + ", per_transaction_limit=" + per_transaction_limit + ", last_account_limit="
				+ last_account_limit + ", last_per_transaction_limit=" + last_per_transaction_limit
				+ ", account_limit_update_time=" + account_limit_update_time + ", per_transaction_limit_update_time="
				+ per_transaction_limit_update_time + "]";
	}
	public CreditCard(Long accountId, int customer_id, int account_limit, int per_transaction_limit,
			int last_account_limit, int last_per_transaction_limit, int account_limit_update_time,
			int per_transaction_limit_update_time) {
		super();
		this.accountId = accountId;
		this.customer_id = customer_id;
		this.account_limit = account_limit;
		this.per_transaction_limit = per_transaction_limit;
		this.last_account_limit = last_account_limit;
		this.last_per_transaction_limit = last_per_transaction_limit;
		this.account_limit_update_time = account_limit_update_time;
		this.per_transaction_limit_update_time = per_transaction_limit_update_time;
	}
}
