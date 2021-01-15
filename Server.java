import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener{
    JPanel p1;// global variable
    JTextField t1;
    JButton b1;

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

        l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons\\1.png"));// loading profile image
        Image i5 = i4.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);// scaling it
        ImageIcon i6 = new ImageIcon(i5);// loading the scaled image
        JLabel l2 = new JLabel(i6);// adding it to label
        l2.setBounds(40, 5, 60, 60);
        p1.add(l2);// add to panel

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons\\video.png")); // loading video icon
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);// scaling it
        ImageIcon i9 = new ImageIcon(i8);// loading the scaled image
        JLabel l5 = new JLabel(i9);// adding it to label
        l5.setBounds(290, 20, 30, 30);
        p1.add(l5);// add to panel

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons\\phone.png")); // loading phone icon
        Image i12 = i11.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);// scaling it
        ImageIcon i13 = new ImageIcon(i12);// loading the scaled image
        JLabel l6 = new JLabel(i13);// adding it to label
        l6.setBounds(350, 20, 35, 30);
        p1.add(l6);// add to panel

        ImageIcon i14 = new ImageIcon(ClassLoader.getSystemResource("icons\\3icon.png")); // loading buttons icon
        Image i15 = i14.getImage().getScaledInstance(13, 25, Image.SCALE_DEFAULT);// scaling it
        ImageIcon i16 = new ImageIcon(i15);// loading the scaled image
        JLabel l7 = new JLabel(i16);// adding it to label
        l7.setBounds(410, 20, 13, 25);
        p1.add(l7);// add to panel

        JLabel l3 = new JLabel("Gaitonde");// adding another label
        l3.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(110, 15, 100, 18);
        p1.add(l3);

        JLabel l4 = new JLabel("Active Now");
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN, 14));
        l4.setForeground(Color.WHITE);
        l4.setBounds(115, 35, 100, 20);
        p1.add(l4);

        t1 = new JTextField();
        t1.setBounds(5,660,390,40);
        t1.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(t1);

        setLayout(null);
        setSize(450, 750);// set the size of frame
        setLocation(400, 200);// position of frame on the screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Server().setVisible(true);// opens the frame when run
    }
}
