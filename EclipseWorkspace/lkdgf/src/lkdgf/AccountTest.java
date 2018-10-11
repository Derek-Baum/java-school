package lkdgf;

import org.junit.Test;

import static org.junit.Assert.*;


public class AccountTest  {
	
	@Test
	public void test_series() {
		System.out.println("Testing Account Class Problem #4");
		Account testAccount = new Account("John Doe", 0, 0.005);
		testAccount.deposit(50);
		testAccount.withdraw(10);
		testAccount.addMonthlyInterest();
		assertEquals(40.2, testAccount.getBalance(), 0.01);
	}
	@Test
	public void deposit(){
		System.out.println("Testing deposit() method.");
		Account testAccount = new Account("name lname", 0, 0.005);
		testAccount.deposit(100);
		assertEquals(100,testAccount.getBalance(),0.0001);
		testAccount.deposit(100);
		assertEquals(200,testAccount.getBalance(),0.0001);
		testAccount.deposit(100);
		assertEquals(300,testAccount.getBalance(),0.0001);
		
	}
	@Test
	public void withdraw(){
		System.out.println("Testing withdraw() method.");
		Account testAccount = new Account("name", 1000, 0.005);
		assertEquals(true,testAccount.withdraw(100));
		assertEquals(900.0,testAccount.getBalance(),0.001);
		assertEquals(true,testAccount.withdraw(300));
		assertEquals(600.0,testAccount.getBalance(),0.001);
		assertEquals(true,testAccount.withdraw(500));
		assertEquals(100.0,testAccount.getBalance(),0.001);
		assertEquals(false,testAccount.withdraw(200));
		assertEquals(100.0,testAccount.getBalance(),0.001);
	}
	@Test
	public void addMonthlyInterest(){
		System.out.println("Testing addMonthlyInterest() method.");
		Account testAccount = new Account("name", 1000, 0.005);
		testAccount.addMonthlyInterest();
		assertEquals(1005,testAccount.getBalance(),0.001);
		testAccount.addMonthlyInterest();
		assertEquals(1005*1.005,testAccount.getBalance(),0.001);
		testAccount.addMonthlyInterest();
		assertEquals(1005*1.005*1.005,testAccount.getBalance(),0.001);
		testAccount.addMonthlyInterest();
		assertEquals(1005*1.005*1.005*1.005,testAccount.getBalance(),0.001);
	}

	// Uncomment this test for problem #5

	
	@Test
	public void test_payoffDebt() {
		System.out.println("Testing Account Class Problem #5");

	    Account positive = new Account("John Doe", 500.0, 0);
	    Account negative = new Account("John Doe", -250.0, 0.01, -5000);
	    
	    // won't do anything since we can't use a negative balance account
	    //  to payoff a positive balance account
		negative.payOffBalance(positive);
	    assertEquals(-250.0, negative.getBalance(),0.0001);
        assertEquals(500.0, positive.getBalance(),0.0001);
        
        // this will pay off the entire negative balance
	    positive.payOffBalance(negative);
        assertEquals(0.0, negative.getBalance(),0.0001);
        assertEquals(250.0, positive.getBalance(),0.0001);

        Account otherNegative = new Account("John Doe", -1000.0, 0.01, -5000);
        
        // this will pay off as much as it can, but will still leave
        //  some negative balance because there is not enough money
        //  in the positive account
        positive.payOffBalance(otherNegative);
        
        assertEquals(-750.0, otherNegative.getBalance(),0.0001);
        assertEquals(0.0, positive.getBalance(),0.0001);
	}
	

}
