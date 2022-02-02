package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


    public class MyWindow extends JFrame {

        private char gg ;
        private Font font = new Font("SanSerif", Font.BOLD, 18);

        private TextField textField = new TextField();

        public MyWindow() {
            setBounds(550, 300, 270, 347);
            setTitle("MyWindow");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);
            textField.setBounds(10, 10, 230, 50);
            textField.setEditable(false);
            add(textField);
            setFocusable(true);
            //getMostRecentFocusOwner();



            setLayout(null);

            JButton action_plus = new JButton(" = ");
            action_plus.setBounds(130 , 250, 110,50 );
            action_plus.setFont(font);
            add(action_plus);

            JButton action = new JButton(" - ");
            action.setBounds(190, 190, 50, 50);
            action.setFont(font);
            add(action);

            JButton backsp = new JButton("<");
            backsp.setBounds(10 , 250 ,50,50);
            backsp.setFont(font);
            add(backsp);

            JButton button[] = new JButton[10];
            // нль
            button[0] = new JButton((0) + " ");
            button[0].setBounds(70, 250, 50, 50);
            button[0].setFont(font);
            add(button[0]);

// 1 2 3 4 5 6 7 8 9

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    button[i * 3 + j + 1] = new JButton((i * 3 + j + 1) + " ");
                    button[i * 3 + j + 1].setBounds(i * (50 + 10) + 10, j * (50 + 10) + 70, 50, 50);
                    button[i * 3 + j + 1].setFont(font);
                    add(button[i * 3 + j + 1]);
                }

            }

            ActionListener l = (ActionEvent e) -> {
                JButton b = (JButton) e.getSource();
                textField.setText(textField.getText() + b.getText());
            };
            for (JButton b : button) {
                b.addActionListener(l);
            }
            action.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + action.getText());
                }
            });
            addKeyListener(new KeyAdapter(){
                @Override
                public void keyPressed(KeyEvent e ){
                    char symbol  = e.getKeyChar();
                    if (!Character.isDigit(symbol)){
                        return;
                    }
                    textField.setText(textField.getText() + symbol);
                }
            });

            setVisible(true);
}

        public static void main (String[]args){
            new MyWindow();
        }

    }
