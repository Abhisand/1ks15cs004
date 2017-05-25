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
public class Mouse_Pos extends Applet implements MouseMotionListener 
{
String msg="";
int X=0,Y=0;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
       
        addMouseMotionListener(this);
    }
   
      public void mouseDragged(MouseEvent me)
    {
        X=me.getX();
        Y=me.getY();
        msg="*";
        showStatus("Dragging mouse at"+X+":"+Y);
        repaint();
    }
        public void mouseMoved(MouseEvent me)
    {
        
        showStatus("mouse moving at"+me.getX()+":"+me.getY());
        repaint();
    }
        public void paint(Graphics g)
        {
            g.drawString(msg,X,Y);
        }
}
