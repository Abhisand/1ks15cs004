package Applets_Swings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author system administrator
 */
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener 
{
String msg="";
int mouseX=0,mouseY=0;


    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        
    }
    public void mouseClicked(MouseEvent me)
    {
        mouseX=0;
        mouseY=10;
        msg="Mouse clicked";
       showStatus("U R Clicking The Mouse...!");
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        mouseX=0;
        mouseY=10;
        msg="Mouse clicked";
        showStatus("U Have Entered Into The Applet..!");
        repaint();
  }

    public void mouseExited(MouseEvent me)
    {
        mouseX=0;
        mouseY=10;
        msg="Mouse exited";
        showStatus("Mouse Exited..!");
        repaint();
    }
     public void mousePressed(MouseEvent me)
    {
        mouseX=me.getX();
        mouseY=me.getY();
        msg="Down";
        showStatus("U have Pressed The Mouse....!");
        repaint();
    }
      public void mouseReleased(MouseEvent me)
    {
        mouseX=me.getX();
        mouseY=me.getY();
        msg="UP";
        showStatus("U Have Released The Mouse...!");
        repaint();
    }
      public void mouseDragged(MouseEvent me)
    {
        mouseX=me.getX();
        mouseY=me.getY();
        msg="*";
        showStatus("Dragging mouse at"+mouseX+":"+mouseY);
        repaint();
    }
        public void mouseMoved(MouseEvent me)
    {
        
        showStatus("mouse moving at"+me.getX()+":"+me.getY());
        repaint();
    }
        public void paint(Graphics g)
        {
            g.drawString(msg,mouseX,mouseY);
        }
}
