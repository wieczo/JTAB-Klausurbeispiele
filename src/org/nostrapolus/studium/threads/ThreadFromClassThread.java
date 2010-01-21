/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nostrapolus.studium.threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.nostrapolus.studium.listeners.Fete;

/**
 *
 * @author wieczo
 */
public class ThreadFromClassThread extends Thread {
    private MonitoredCounter counter;
    public Boolean isRunning;

    public ThreadFromClassThread(MonitoredCounter fete) {
//        this.thread = new Thread();
        this.counter = new MonitoredCounter();
        this.isRunning = false;
    }


    public void run() {
        this.isRunning = true;
        for (Fete.FeteStatus status : Fete.FeteStatus.values()) {
            if (!isRunning  && counter.getCounter() < 20)
                break;

            counter.incrementCounter();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadFromRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Yay! Der Klassische" + " " + counter.getCounter());
        }
    }

    public void stopRunning() {
        this.isRunning = false;
    }
    
}
