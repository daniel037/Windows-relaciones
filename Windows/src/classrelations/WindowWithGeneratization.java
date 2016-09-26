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
public class WindowWithGeneratization extends Frame {
    //..................................
    public WindowWithGeneratization(){
        setTitle("My First Window generalization");
        setSize(400,300);
        setVisible(true);
    }
    //..............................................
    public static void main(String[] args) {
        new WindowWithGeneratization();
    }
}