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
public class WindowWithAssociation {
    private Frame f;
    //.......................................
    public WindowWithAssociation(){
        f=new Frame();
        f.setTitle("My First Window Association");
        f.setSize(400, 300);
        f.setVisible(true);
    }
    //....................................................
    public static void main(String[] args) {
        new WindowWithAssociation();
    }
}