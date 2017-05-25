package Applets_Swings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author system administrator
 */
public class Mouse_Demo extends Applet implements MouseListener
{
String msg="";
int mouseX=0,mouseY=0;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        addMouseListener(this);
      
    }
    public void mouseClicked(MouseEvent me)
    {
      
    }
    public void mouseEntered(MouseEvent me)
    {
       
    }

    public void mouseExited(MouseEvent me)
    {
        
    }
     public void mousePressed(MouseEvent me)
    {
        mouseX=me.getX();
        mouseY=me.getY();
        msg="Hello world!";
        repaint();
    }
      public void mouseReleased(MouseEvent me)
    {
        
    }
     
        public void paint(Graphics g)
        {
            g.drawString(msg,mouseX,mouseY);
        }
}
