/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.part.one;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author oreho
 */
public class StartScreen extends JPanel{
    public StartScreen(){
        super();
        setBackground(Color.green);
        add(start);
        add(loud);
        System.out.println("This is StsrtScreen");
        getEventButton(start);
        getEventButton(loud);
    }
    
    private JButton start = new JButton("Start");
    private JButton loud = new JButton("Loud");
    private EventListener evLis = new EventListener();
    
    private void getEventButton(JButton b){
        evLis.getTheSource(b);
    }
    
    
    
}
