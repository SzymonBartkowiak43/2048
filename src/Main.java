import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Frame frame = new Frame();

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

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(800,900);
        //frame.setLayout(null);

        frame.setVisible(true);
        frame.add(label); //dodaje do tablicy
        frame.pack(); // ustawia automatycznie wszystko



    }
}