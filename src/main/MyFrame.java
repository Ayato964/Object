package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class MyFrame extends JFrame {
    private static final JTextField TEXT = new JTextField();
    private static final TextArea AREA = new TextArea();

    private static final DefaultListModel<String> DEFAULT_LIST_MODEL = new DefaultListModel<>();
    private static final JList<String> LIST = new JList<>(DEFAULT_LIST_MODEL);
    private MyFrame() {
        setLocation(50, 50);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add("North", TEXT);
        AREA.setEditable(false);
        add("Center", LIST);
        JPanel panel = new JPanel();
        addButton(panel, "Add", this::addText);
        addButton(panel, "Clear", this::removeText);
        add("South", panel);
    }
    private void addButton(JPanel p, String name, ActionListener ifPressed){
        JButton b = new JButton(name);
        b.addActionListener(ifPressed);
        p.add(b);
    }
    public void addText(ActionEvent e){

        DEFAULT_LIST_MODEL.addElement(TEXT.getText());
        TEXT.setText(null);

    }
    private void removeText(ActionEvent e){
        ArrayList<String> indexes = (ArrayList<String>) LIST.getSelectedValuesList();
        for(String i : indexes){
            DEFAULT_LIST_MODEL.removeElement(i);
        }

    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}