/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtodoinjava.demo.controller;

import com.howtodoinjava.demo.model.EmployeeVO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author matthouse
 */
public class EmployeeControllerTest {
    
    public EmployeeControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setupForm method, of class EmployeeController.
     */
    @Test
    public void testSetupForm() {
        System.out.println("setupForm");
        Model model = null;
        EmployeeController instance = new EmployeeController();
        String expResult = "";
        String result = instance.setupForm(model);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submitForm method, of class EmployeeController.
     */
    @Test
    public void testSubmitForm() {
        System.out.println("submitForm");
        EmployeeVO employeeVO = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        EmployeeController instance = new EmployeeController();
        String expResult = "";
        String result = instance.submitForm(employeeVO, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of success method, of class EmployeeController.
     */
    @Test
    public void testSuccess() {
        System.out.println("success");
        Model model = null;
        EmployeeController instance = new EmployeeController();
        String expResult = "";
        String result = instance.success(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
