package project7;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() {
        setLocation(50, 50);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField text = new JTextField();
        add("Center", text);
        JButton button = new JButton("push");
        button.addActionListener(ae -> {
            text.setText(text.getText().toUpperCase());
        });
        add("South", button);
    }
}
