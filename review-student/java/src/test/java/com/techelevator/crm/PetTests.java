package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {

    private Pet pet;

    @Before
    public void setup() {
        pet = new Pet();
    }

    @Test
    public void test_list_vaccinations_method() {
        //Act
        List<String> list = new ArrayList();
        list.add("Blah");
        list.add("Bloo");
        list.add("Blee");
        String result = pet.listVaccinations();
        //Assert
        Assert.assertEquals("Blah, Bloo, Blee", result);
    }
}
