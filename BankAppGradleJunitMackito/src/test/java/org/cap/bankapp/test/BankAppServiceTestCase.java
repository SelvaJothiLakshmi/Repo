package org.cap.bankapp.test;

import org.cap.dto.Address;
import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BankAppServiceTestCase {
	
	private AcccountService accountService;
	
	@BeforeClass
	public static void before_Class(){
		//System.out.println("Before class Method");	
	}   
	
	@AfterClass
	public static void after_Class(){
		//System.out.println("After class Method");	
	}
	
	@Before
	public void setUp(){
		//System.out.println("Before Method");
		accountService=new AccountServiceImpl();
		
	}
	
	
	@Category(GoodTestCategory.class)
	@Test
	public void test_addNumbers_Method(){
		//accountService=new AccountServiceImpl();
		
		Assert.assertEquals(9, accountService.addNumbers(5, 4));
	}
	
	
	@Category(BadTestCategory.class)
	@Test(expected=IllegalArgumentException.class)
	public void test_addAccount_method_when_customer_is_null() throws InvalidInitialAmountException{
		Customer customer=null;
		double amount=1500;
		//accountService=new AccountServiceImpl();
		accountService.addAccount(customer, amount);
		
	}
	
	@Category(GoodTestCategory.class)
	@Test(expected=InvalidInitialAmountException.class)
	public void test_addAccount_method_with_insufficient_balance() throws InvalidInitialAmountException{
		Customer customer=new Customer();
		customer.setCustName("Tom");
		customer.setCustAddress(new Address());
		double amount=400;
		//accountService=new AccountServiceImpl();
		accountService.addAccount(customer, amount);
	}
	
	@After
	public void tearDown(){
		//System.out.println("After Method");
	}
	
	
	@Category(BadTestCategory.class)
	@Ignore
	@Test(timeout=10)
	public void myloop_test(){
		long sum=0;
		for(int i=1;i<1000000;i++)
			sum+=i;
	}

}
