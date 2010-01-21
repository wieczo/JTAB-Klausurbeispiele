/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nostrapolus.studium.threads;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wieczo
 */
public class ThreadingTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void runThreads() {
        MonitoredCounter counter = new MonitoredCounter();
        ThreadFromClassThread classedThread = new ThreadFromClassThread(counter);
        ThreadFromRunnable runnableThread = new ThreadFromRunnable(counter);
        Thread wrapper = new Thread(runnableThread);

        wrapper.start();
        classedThread.start();
    }

}