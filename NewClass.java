/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applets_Swings;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author Abhishek
 */
public class NewClass extends JApplet
{
    JButton b1;
    JButton b2;
 public void init() 
{
try {
SwingUtilities.invokeAndWait(
new Runnable() 
    {
public void run() 
        {
        MakeGUI();
        }
    });
}    
catch (Exception ex) {} 
}
 private void MakeGUI()
    {
     
     b1=new JButton("Line");
      b2=new JButton("circle");
     setLayout(new FlowLayout());
     add(b1);
     add(b2);
     b1.addActionListener(new ActionListener() 
     {

         @Override
         public void actionPerformed(ActionEvent e) 
         {
           
         }
     });
     b2.addActionListener(new ActionListener() 
     {

         @Override
         public void actionPerformed(ActionEvent e) 
         {
           
         }
     });
    }
 public void paint(Graphics g)
    {
       
    }
 }
