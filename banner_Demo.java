package Applets_Swings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pradeep
 */
public class banner_Demo extends Applet implements Runnable
{
 String msg="Welcome To Ksit";
 String msg1="Welcome To Ksit";
 String msg2="Welcome To Ksit";
 Thread t=null;
 int state;
 boolean stopFlag;
    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.cyan);
        setForeground(Color.red);
    }
    public void start()
    {
        t=new Thread(this);
        stopFlag=false;
        t.start();

    // TODO overwrite start(), stop() and destroy() methods
}
    public void run()
    {
        char ch;
        for(;;)
        {
            try
            {
               repaint();
               Thread.sleep(250);
               ch=msg.charAt(0);
               msg=msg.substring(1, msg.length());
               msg+=ch;
              //left To right
               ch=msg1.charAt(msg1.length()-1);
               msg1=msg1.substring(0, msg1.length()-1);
               msg1=ch+msg1;
               if(stopFlag)
                   break;
            }
            catch(InterruptedException e)
            {
                
            }
            }
        }
    public void stop()
    {
        stopFlag=true;
        t=null;
        
    }
    public void paint(Graphics g)
    {
        
        g.drawString(msg,250,250);
         g.drawString(msg1, 250, 350);//Blinking Effects
     try {Thread.sleep(20);} catch (InterruptedException ex) {}
        g.drawString(msg2,250 , 300);
        //Thread.yield();
       
        
    }
}