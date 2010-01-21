/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nostrapolus.studium.threads;

/**
 * Monitor-Implementer
 * 
 * @author wieczo
 */
public class MonitoredCounter {
    private int counter;

    public MonitoredCounter() {
        counter = 0;
    }

    public synchronized void incrementCounter() {
        this.counter += 1;
    }

    // synchronized kann hier weg gelassen werden,
    // weil nur ein atomarer Zugriff statt findet.
    public int getCounter() {
        return counter;
    }

    private synchronized void setCounter(int counter) {
        this.counter = (counter);
    }


}
