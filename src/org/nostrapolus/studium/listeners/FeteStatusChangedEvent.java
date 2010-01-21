/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nostrapolus.studium.listeners;

import java.util.EventObject;

/**
 *
 * @author wieczo
 */
public class FeteStatusChangedEvent extends EventObject {
    public FeteStatusChangedEvent(Fete source) {
        super(source);
    }

    public Fete getFete() {
        return this.getSource();
    }

    @Override
    public Fete getSource() {
        return (Fete) super.getSource();
    }
}
