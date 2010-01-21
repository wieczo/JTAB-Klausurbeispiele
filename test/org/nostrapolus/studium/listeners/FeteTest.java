/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nostrapolus.studium.listeners;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nostrapolus.studium.listeners.Fete.FeteStatus;

/**
 *
 * @author wieczo
 */
public class FeteTest {
    private Fete fete;
    private FeteStatus newStatus;

    public FeteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        fete = new Fete();
        fete.addFeteStatusChangedListener(new FeteStatusChangedListener() {
            public void feteStatusChanged(Fete fete) {
                newStatus = fete.getStatus();
            }
        });
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getStatus method, of class Fete.
     */
    @Test
    public void testChangeAndGetStatus() {
        System.out.println("getStatus");
        Fete instance = new Fete();
        
        for (Fete.FeteStatus expResult : Fete.FeteStatus.values()) {
            fete.setStatus(s);
            assertEquals(expResult, newStatus);
        }
    }

    /**
     * Test of setStatus method, of class Fete.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        FeteStatus status = null;
        Fete instance = new Fete();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFeteStatusChangedListener method, of class Fete.
     */
    @Test
    public void testAddFeteStatusChangedListener() {
        System.out.println("addFeteStatusChangedListener");
        FeteStatusChangedListener listener = null;
        Fete instance = new Fete();
        instance.addFeteStatusChangedListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFeteStatusChangedListener method, of class Fete.
     */
    @Test
    public void testRemoveFeteStatusChangedListener() {
        System.out.println("removeFeteStatusChangedListener");
        FeteStatusChangedListener listener = null;
        Fete instance = new Fete();
        instance.removeFeteStatusChangedListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}