/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nostrapolus.studium.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wieczo
 */
public class ThreadFromRunnable implements Runnable {
    private MonitoredCounter counter;
    public Boolean isRunning;

    public ThreadFromRunnable(MonitoredCounter fete) {
        this.counter = new MonitoredCounter();
        this.isRunning = false;
    }


    public void run() {
        this.isRunning = true;
                // Thread versetzt sich selbst in den sleeping Zustand
                // Die InterruptedException tritt auf, wenn der Thread mit interrupt unterbrochen wurde
        while (isRunning && counter.getCounter() < 20)
                counter.incrementCounter();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadFromRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void stopThread() {
        isRunning = false;
    }
}
