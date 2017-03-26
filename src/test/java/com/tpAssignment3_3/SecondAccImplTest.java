package com.tpAssignment3_3;

import org.junit.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-03-26.
 */
public class SecondAccImplTest {
    private AccountInterface acc;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AccConfig.class);
        acc = (AccountInterface)ctx.getBean("newDep");
    }

    @Test
    public void testMultiply() throws Exception {
        int result = acc.deposit(5,5);
        Assert.assertEquals(12, result);
    }

    @Test
    public void testAdd() throws Exception {
        int result = acc.withdraw(10,3);
        Assert.assertEquals(5, result);
    }
}