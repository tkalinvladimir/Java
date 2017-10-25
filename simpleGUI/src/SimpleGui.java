import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {
    static JButton button;

    public static void main(String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }
}
