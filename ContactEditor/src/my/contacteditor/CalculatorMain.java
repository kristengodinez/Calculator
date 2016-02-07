/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.contacteditor;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @authors Kristen Godinez, Winter Smith
 * COMP 350 - Lab 2
 * 02/03/16
 */
public class CalculatorMain {
    public static void main(String[] args) {
       JFrame frame = new ContactEditorUI();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
     }
}

