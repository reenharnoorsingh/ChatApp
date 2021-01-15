import javax.swing.*;

public class Server extends JFrame {
    JPanel p1;//global variable

    Server(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""));

        setSize(450,700);//set the size of frame
        setLocation(400,200);//position of frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new Server().setVisible(true);//opens the frame when run
    }
}
