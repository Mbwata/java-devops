/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtodoinjava.demo.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matthouse
 */
public class EmployeeVOIT {
    
    public EmployeeVOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class EmployeeVO.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        EmployeeVO instance = new EmployeeVO();
        Integer expResult = null;
        Integer result = instance.getId();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class EmployeeVO.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        EmployeeVO instance = new EmployeeVO();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class EmployeeVO.
     */
    @Test
    public void testGetFirstName1() {
        System.out.println("getFirstName");
        EmployeeVO instance = new EmployeeVO();
        instance.setFirstName("matt");
        String expResult = "Matt";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class EmployeeVO.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "MATT";
        EmployeeVO instance = new EmployeeVO();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
       System.out.println(instance.getFirstName());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class EmployeeVO.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        EmployeeVO instance = new EmployeeVO();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class EmployeeVO.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        EmployeeVO instance = new EmployeeVO();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class EmployeeVO.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        EmployeeVO instance = new EmployeeVO();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class EmployeeVO.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        EmployeeVO instance = new EmployeeVO();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class EmployeeVO.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EmployeeVO instance = new EmployeeVO();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
