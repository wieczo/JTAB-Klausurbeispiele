/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nostrapolus.studium.listeners;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author wieczo
 */
public class Fete {
    List<FeteStatusChangedListener> listeners;

    public static enum FeteStatus {
        IN_PLANUNG, ANGELEGT, GESTARTET, SUBBA_STIMMUNG, LICHTEND, BEENDET
    }

    private FeteStatus status;

    public Fete() {
        status = FeteStatus.IN_PLANUNG;
        listeners = new LinkedList<FeteStatusChangedListener>();
    }
    
    public FeteStatus getStatus() {
        return status;
    }

    public void setStatus(FeteStatus status) {
        if (this.status != status) {
            this.status = status;
            callStatusChange();
        }
    }


    public void addFeteStatusChangedListener(FeteStatusChangedListener listener) {
        listeners.add(listener);
    }

    public void removeFeteStatusChangedListener(FeteStatusChangedListener listener) {
        listeners.remove(listener);
    }

    private void callStatusChange() {
        LinkedList<FeteStatusChangedListener> copy = new LinkedList<FeteStatusChangedListener>(listeners);
        for (FeteStatusChangedListener l : copy)
            l.feteStatusChanged(this);
    }


}
