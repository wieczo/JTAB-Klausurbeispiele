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
    FeteStatus newStatus;

    /**
     * Test of getStatus method, of class Fete.
     */
    @Test
    public void testChangeAndGetStatus() {
        Fete fete;
        System.out.println("getStatus");
        fete = new Fete();
        // Add EventListener
        fete.addFeteStatusChangedListener(new FeteStatusChangedListener() {
            public void feteStatusChanged(Fete fete) {
                newStatus = fete.getStatus();
            }
        });
        
        for (Fete.FeteStatus expResult : Fete.FeteStatus.values()) {
            fete.setStatus(expResult);
            assertEquals(expResult, fete.getStatus());
        }
    }

}