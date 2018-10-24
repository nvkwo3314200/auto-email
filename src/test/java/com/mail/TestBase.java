package com.mail;

import java.util.logging.Logger;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager")
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public abstract class TestBase {
	protected Logger logger = Logger.getLogger(this.getClass().getName());
//public abstract class TestBase extends AbstractTransactionalJUnit4SpringContextTests {

}