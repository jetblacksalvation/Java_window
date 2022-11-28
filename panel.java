import java.awt.*;
import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class panel extends JPanel implements KeyListener {
    float angle = 0;
    
    vector pos[];
    
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyChar() == 'q'){
            
        }
        if(e.getKeyChar() == 'e'){

        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    panel(){
        this.setPreferredSize(new Dimension(800,800));//this function is stupid 
    }   
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;//for somereason it's legal to cast classes? 
        g2d.drawLine(0,0,500,500);
    }
}
