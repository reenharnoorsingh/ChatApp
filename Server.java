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
        p1.add(l1);// add to panel

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons\\1.png"));// loading arrow image
        Image i5 = i4.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);// scaling it
        ImageIcon i6 = new ImageIcon(i5);// loading the scaled image
        JLabel l2 = new JLabel(i6);// adding it to label
        l2.setBounds(40, 5, 60, 60);
        p1.add(l2);// add to panel

        JLabel l3 = new JLabel("Gaitonde");//adding another label
        l3.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(110,15,100,18);
        p1.add(l3);

        JLabel l4 = new JLabel("Active Now");
        l4.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
        l4.setForeground(Color.WHITE);
        l4.setBounds(115,35,100,20);
        p1.add(l4);

        setLayout(null);
        setSize(450, 700);// set the size of frame
        setLocation(400, 200);// position of frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new Server().setVisible(true);// opens the frame when run
    }
}
