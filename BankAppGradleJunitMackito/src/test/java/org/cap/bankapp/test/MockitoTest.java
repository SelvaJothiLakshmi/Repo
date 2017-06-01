package org.cap.bankapp.test;

import org.cap.dao.AccountDao;
import org.cap.dto.Account;
import org.cap.dto.Address;
import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockitoTest {
	   
	private AcccountService accountService;
	
	@Mock
	private AccountDao accountDao;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		accountService=new AccountServiceImpl(accountDao);
	}
	
	
	@Test
	public void test_findByAccountId(){
		Account account=new Account();
		account.setAccountNo(1001);
		Customer customer=new Customer();
		customer.setCustName("Tom");
		customer.setCustAddress(new Address());
		account.setCustomer(customer);
		account.setAmount(2000);
		
		
		//Declaration
		Mockito.when(accountDao.findAccountById(1001)).thenReturn(account);
		
		//Actual Method Invocation
		Account acutal_account=accountService.findAccountById(1001);
		
		//Verification
		Mockito.verify(accountDao).findAccountById(1001);
		Assert.assertEquals(2000, acutal_account.getAmount(),0.0);
		
		
		
	}
	
	
	@Test
	public void test_Add_account_method() throws InvalidInitialAmountException{
		Account account=new Account();
		//account.setAccountNo(1001);
		Customer customer=new Customer();
		customer.setCustName("Tom");
		customer.setCustAddress(new Address());
		account.setCustomer(customer);
		account.setAmount(2000);
		
		//declaration
		Mockito.when(accountDao.createAccount(account)).thenReturn(true);
		
		//Actual Method Call
		Account new_Account=accountService.addAccount(customer, 2000);
		
		//Verification
		Mockito.verify(accountDao).createAccount(account);
		
	}
	
	
	@Test
	public void test_Deposit(){
		Account account=new Account();
		account.setAccountNo(1001);
		Customer customer=new Customer();
		customer.setCustName("Tom");
		customer.setCustAddress(new Address());
		account.setCustomer(customer);
		account.setAmount(2000);
		
		
		//Declaration
		Mockito.when(accountDao.findAccountById(1001)).thenReturn(account);
		
		//Actual Method Invocation
		Account acutal_account=accountService.deposit(1001,3000);
		
		//Verification
		Mockito.verify(accountDao).findAccountById(1001);
		
		Assert.assertEquals(5000, acutal_account.getAmount(),0.0);
	}
	
	
	
	
	
	
	
	
	
	
	

}
