import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Action_listner extends Frame implements ActionListener {
    TextField tf;
    Action_listner(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Just Click Me!");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);

        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Action_listner();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("You just clicked the button .");
    }
}
