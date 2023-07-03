import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frame extends JFrame {
    Frame() {

        ImageIcon image = new ImageIcon("Puste.png");

        Border border = BorderFactory.createLineBorder(Color.green,3);


        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label.setIconTextGap(40);

        label.setBackground(Color.black);
        label.setOpaque(true); //potrzebne do tla

        label.setBorder(border); // dodaje ramke
        label.setVerticalAlignment(JLabel.CENTER); //ustawia icona+tekst na srodku
        label.setHorizontalAlignment(JLabel.CENTER); // ustawia icone+tekst na srodku
        //label.setBounds(100,0,500,750);


        this.add(label);


    }
}
