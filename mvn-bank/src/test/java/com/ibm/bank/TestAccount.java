package com.ibm.bank;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	
	private Account a;
	
	@BeforeEach
	public void init() {
		a=new Account(1000);
	}
	@Test 
	public void testwithdraw () throws BalanceException {
		System.out.println(a.withdraw(200));
	}
	@Test
	public void testInvalidwithdraw () {
		assertThrows(BalanceException.class, ()-> a.withdraw(1500));
	}
	@Test 
	public void testNegativewithdraw () throws BalanceException{
		assertThrows(NumberFormatException.class, ()-> a.withdraw(-100));
	}
	
	@Test
	public void testDeposit() {
		assertEquals(2000,a.deposit(1000));
	}
	
	@Test
	public void testNegativeDeposit() {
		assertThrows(NumberFormatException.class, ()-> a.deposit(-100));
	}
	
}
