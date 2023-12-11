import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class JFrameDisableButton2 extends JFrame implements ItemListener, ActionListener {
    JLabel frustrationText = new JLabel("That's enough!");
    JButton tickerButton = new JButton();
    FlowLayout frameLayout = new FlowLayout(FlowLayout.CENTER);
    int buttonClicks = 0;
    public JFrameDisableButton2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(frameLayout);
        setSize(400,200);

        tickerButton.addActionListener(this);
        tickerButton.setVisible(true);

        frustrationText.setVisible(false);
        add(tickerButton);
        add(frustrationText);
    }

    public static void main(String args[]){
        JFrameDisableButton2 myFrame = new JFrameDisableButton2();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == tickerButton){
            frustrationText.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tickerButton){
            buttonClicks++;
            tickerButton.setEnabled(buttonClicks < 8);
            if (!tickerButton.isEnabled()){
                frustrationText.setVisible(true);
            }
        }
    }
}
