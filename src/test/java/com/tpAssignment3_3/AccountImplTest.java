package com.tpAssignment3_3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-03-26.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by student on 2016/03/12.
 */
public class AccountImplTest {

    private AccountInterface cal;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AccConfig.class);
        cal = (AccountInterface)ctx.getBean("dep");
    }

    @Test
    public void testDeposit() throws Exception {
        int result = cal.deposit(10,10);
        Assert.assertEquals(20, result);
    }

    @Test
    public void testWithdraw() throws Exception {
        int result = cal.withdraw(20,3);
        Assert.assertEquals(17, result);
    }
}