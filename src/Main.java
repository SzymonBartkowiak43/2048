import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("Puste.png");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(610,635);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        JLabel label1 = new JLabel();
        label1.setIcon(image);
        label1.setBounds(0,0,150,150);
        frame.add(label1);

        JLabel label2 = new JLabel();
        label2.setIcon(image);
        label2.setBounds(150,0,150,150);
        frame.add(label2);

        JLabel label3 = new JLabel();
        label3.setIcon(image);
        label3.setBounds(300,0,150,150);
        frame.add(label3);

        JLabel label4 = new JLabel();
        label4.setIcon(image);
        label4.setBounds(450,0,150,150);
        frame.add(label4);

        JLabel label5 = new JLabel();
        label5.setIcon(image);
        label5.setBounds(0,150,150,150);
        frame.add(label5);

        JLabel label6 = new JLabel();
        label6.setIcon(image);
        label6.setBounds(150,150,150,150);
        frame.add(label6);

        JLabel label7 = new JLabel();
        label7.setIcon(image);
        label7.setBounds(300,150,150,150);
        frame.add(label7);

        JLabel label8 = new JLabel();
        label8.setIcon(image);
        label8.setBounds(450,150,150,150);
        frame.add(label8);

        JLabel label9 = new JLabel();
        label9.setIcon(image);
        label9.setBounds(0,300,150,150);
        frame.add(label9);

        JLabel label10 = new JLabel();
        label10.setIcon(image);
        label10.setBounds(150,300,150,150);
        frame.add(label10);

        JLabel label11 = new JLabel();
        label11.setIcon(image);
        label11.setBounds(300,300,150,150);
        frame.add(label11);

        JLabel label12 = new JLabel();
        label12.setIcon(image);
        label12.setBounds(450,300,150,150);
        frame.add(label12);

        JLabel label13 = new JLabel();
        label13.setIcon(image);
        label13.setBounds(0,450,150,150);
        frame.add(label13);

        JLabel label14 = new JLabel();
        label14.setIcon(image);
        label14.setBounds(150,450,150,150);
        frame.add(label14);

        JLabel label15 = new JLabel();
        label15.setIcon(image);
        label15.setBounds(300,450,150,150);
        frame.add(label15);

        JLabel label16 = new JLabel();
        label16.setIcon(image);
        label16.setBounds(450,450,150,150);
        frame.add(label16);


    }
}