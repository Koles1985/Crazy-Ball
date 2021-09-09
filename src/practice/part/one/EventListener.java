/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.part.one;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author oreho
 */
public class EventListener implements ActionListener{
    
    public String getTheSource(JButton button ){
        String nameButton = button.getText();
        System.out.println(nameButton);
        return nameButton;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    
    }
    
}
