import java.awt.*;
import java.awt.event.*;
// Our class extends Frame class and implements ActionListener interface
public class TextFieldExample2 extends Frame implements ActionListener {
    // creating instances of TextField and Button class
    TextField tf1, tf2, tf3;
    Button b1, b2 ,b3 , b4;
    Label l1,l2,l3;
    // instantiating using constructor
    TextFieldExample2() {
        // instantiating objects of text field and button
        // setting position of components in frame
        tf1 = new TextField();
        tf1.setBounds(70, 50, 150, 20);
        l1 = new Label("Number 1: ");
        l1.setBounds(10,50,150,20);
        tf2 = new TextField();
        tf2.setBounds(70, 100, 150, 20);
        l2 = new Label("Number 2: ");
        l2.setBounds(10,100,150,20);
        tf3 = new TextField();
        tf3.setBounds(70, 150, 150, 20);
        tf3.setEditable(false);
        l3 = new Label("Result: ");
        l3.setBounds(10,150,150,20);
        b1 = new Button("+");
        b1.setBounds(50, 200, 50, 50);
        b2 = new Button("-");
        b2.setBounds(120,200,50,50);
        b3 = new Button("*");
        b3.setBounds(190, 200, 50, 50);
        b4 = new Button("/");
        b4.setBounds(270, 200, 50, 50);
        // adding action listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        // adding components to frame
        add(tf1);
        add(l1);
        add(tf2);
        add(l2);
        add(tf3);
        add(l3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        // setting size, layout and visibility of frame
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setTitle("Mini Calculator by Srajal Sawner.");
    }
    // defining the actionPerformed method to generate an event on buttons
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1){
            c = a + b;
        }
        else if (e.getSource() == b2){
            c = a - b;
        }
        else if (e.getSource() == b3){
            c = a*b;
        }
        else if (e.getSource() == b4){
            c = a/b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }
    // main method
    public static void main(String[] args) {
        new TextFieldExample2();
    }
}