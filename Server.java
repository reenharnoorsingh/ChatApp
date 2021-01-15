import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    JPanel p1;// global variable

    Server() {

        p1 = new JPanel();
        p1.setLayout(null);// removing the default layout
        p1.setBackground(new Color(12, 80, 130));// setting the colour of the menu
        p1.setBounds(0, 0, 450, 70);// setting the bounds
        add(p1);// adding to frame

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons\\3.png"));// loading arrow image
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);// scaling it
        ImageIcon i3 = new ImageIcon(i2);// loading the scaled image
        JLabel l1 = new JLabel(i3);// adding it to label
        l1.setBounds(5, 17, 30, 30);
        add(l1);// add to frame

        setLayout(null);
        setSize(450, 700);// set the size of frame
        setLocation(400, 200);// position of frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new Server().setVisible(true);// opens the frame when run
    }
}
