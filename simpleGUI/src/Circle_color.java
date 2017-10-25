import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circle_color {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        Circle_color gui = new Circle_color();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change label");
        button.addActionListener(new LabelListener());
        JButton button2 = new JButton("Change circle");
        button2.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, button2);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }


    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            Color c = new Color(255,255,255);

            g.setColor(c);
            g.fillRect(0,0,this.getWidth(),this.getHeight());


            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);

            Color randColor = new Color(red,green,blue);
            g.setColor(randColor);
            g.fillOval(70,70,100,100);
        }
    }
}
