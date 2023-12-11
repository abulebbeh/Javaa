import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener {
        JLabel bodyText = new JLabel("Default text");
        JButton titleButton = new JButton("Source");
        JLabel titleText = new JLabel("Default text");
    public JBookQuote2(){

        this.setSize(640, 480);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setVisible(true);
        titleButton.addActionListener(this);
        titleText.setVisible(false);
        this.add(bodyText);
        this.add(titleButton);
        this.add(titleText);
    }
    public static void main(String args[]){
        JBookQuote2 quote = new JBookQuote2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == titleButton){
            titleText.setVisible(true);
        }
    }
}
