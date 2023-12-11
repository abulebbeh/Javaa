import javax.swing.*;

public class JBookQuote extends JFrame {
    public JBookQuote(){
        JLabel text = new JLabel("Default text");
        this.add(text);
        this.setTitle("Books Display");
        this.setSize(640, 480);
        this.setVisible(true);
    }
    public static void main(String args[]){
        JFrame quote = new JBookQuote();
    }
}
