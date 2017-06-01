package org.cap.bankapp.test;

import java.util.Arrays;
import java.util.List;

import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ParameterizedTestCase {
	private AcccountService accountService;
	   
	private int input1;
	private int input2;
	private int output;
	public ParameterizedTestCase(int input1,int input2, int output) {
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
	}
	@Parameters
	public static List<Object[]> myData(){
		return Arrays.asList(new Object[][]{
			{2,3,5},
			{0,4,4},
			{1,11,12}
		});
	}
	
	@Category(BadTestCategory.class)
	@Test
	public void test_AddNumbers_with_several_input(){
		accountService=new AccountServiceImpl();
		
		Assert.assertEquals(output, accountService.addNumbers(input1, input2));;
	}
	
}
