package com.techelevator.crm;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    private Customer customer;

    @Before
    public void setup(){customer = new Customer();}

    @Test
    public void test_get_balance_due(){
        //Act
        Map<String, Double> test = new HashMap<>();
        test.put("Walking", 100.0);
        test.put("Grooming", 200.0);
        test.put("Sitting", 250.0);
        double result = customer.getBalanceDue(test);
        //Assert
        TestCase.assertEquals("fail",550.0, result);
    }

}
