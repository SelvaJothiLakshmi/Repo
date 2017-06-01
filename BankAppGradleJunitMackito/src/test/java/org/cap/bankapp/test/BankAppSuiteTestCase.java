package org.cap.bankapp.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BankAppServiceTestCase.class, MyFirstTestClass.class, ParameterizedTestCase.class })
public class BankAppSuiteTestCase {
   
}
