import java.awt.*;

public class button1 extends Frame {

    button1(){

        Button b = new Button("Click Me!");

        b.setBounds(50,100,80,30);

        add(b);

        setSize(300,300);

        setTitle("Program for button");

        setLayout(null);

        setVisible(true);

    }











    public static void main(String[] args) {

        button1 f = new button1();

    }
}
