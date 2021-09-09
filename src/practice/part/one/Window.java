/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.part.one;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author oreho
 */
public class Window {
    
    private JFrame window = new JFrame("Crazy Ball");
    private StartScreen startScreen = new StartScreen();
   
    private void addScreen(JPanel screen){
        window.getContentPane().add(BorderLayout.CENTER, screen);
    }
    
    private void createWindow(){
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addScreen(startScreen);
        window.setSize(900, 600);
        window.setVisible(true);
    }
    
    public void go(){
        createWindow();
    }
    
   
}
