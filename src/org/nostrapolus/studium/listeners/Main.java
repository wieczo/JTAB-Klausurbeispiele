/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nostrapolus.studium.listeners;

/**
 *
 * @author wieczo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fete fete = new Fete();
        fete.addFeteStatusChangedListener(new FeteStatusChangedListener() {
            public void feteStatusChanged(Fete fete) {
                System.out.println("Der Status der Fete änderte sich: " + fete.getStatus().toString());
            }
        });

        for (Fete.FeteStatus s : Fete.FeteStatus.values()) {
            fete.setStatus(s);
        }
    }

}
