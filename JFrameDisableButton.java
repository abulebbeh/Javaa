import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class JFrameDisableButton extends JFrame implements ActionListener {
    JButton button = new JButton();
    public JFrameDisableButton(){
       setSize(640,480);
       button.addActionListener(this);
       add(button);
       setVisible(true);
    }

    public static void main(String args[]){
        JFrameDisableButton myFrame = new JFrameDisableButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       button.setEnabled(false);
    }
}
