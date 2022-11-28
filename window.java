import javax.swing.*;

public class window extends JFrame{
    panel pan;
    window(){
        pan = new panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.add(pan);
        this.pack();//for some reason set size is more of a suggestion 
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
    
}
