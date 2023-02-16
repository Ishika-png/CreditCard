package com.ishika.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ishika.springrest.entities.CreditCard;
import com.ishika.springrest.repository.CreditCardRepository;

@RestController
public class CreditCardController {
	
	@Autowired
	private CreditCardRepository creditCardRepo;
	
	@GetMapping("/getCreditCard")
	public List<CreditCard> getAllCreditCards() {
		return creditCardRepo.findAll();
	}
	
	@GetMapping("/getId/{accountId}/getDate/{activeDate}")
	public Optional<CreditCard> getCreditCard(@PathVariable Long accountId, @PathVariable int activeDate) {
		return creditCardRepo.findById(accountId);
	}
	
	@PostMapping("/postCreditCard")
	public CreditCard postCreditCard(@RequestBody CreditCard c) {
		return creditCardRepo.save(c);
	}
	
	@PutMapping("/getId/{accountId}/getLimit/{limit}")
	public CreditCard updateCreditCardLimit(@PathVariable Long accountId, @PathVariable int limit) {
		CreditCard creditCardLimit = creditCardRepo.findById(accountId).get();
		creditCardLimit.setLast_per_transaction_limit(limit);
		return creditCardRepo.save(creditCardLimit);
	}
}
