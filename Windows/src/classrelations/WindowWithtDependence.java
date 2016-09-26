/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrelations;

import java.awt.Frame;

/**
 *
 * @author daniel
 */
public class WindowWithtDependence {
    //-------------------------------------------
    public WindowWithtDependence(){
        Frame f = new Frame();
        f.setTitle("My First Window Dependence");
        f.setSize(400, 300);
        f.setVisible(true);
    }
    //..........................................
    public static void main(String[] args) {//psvm+tab o p+barraesp.
        new WindowWithtDependence();
    }
}