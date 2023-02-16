package com.ishika.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishika.springrest.entities.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
	
}
