import java.awt.*;

public class Labels_practice extends Frame {



    public static void main(String[] args) {

        Frame f = new Frame("Label example.");

        Label l1,l2;

        l1 = new Label (" Name ");
        l2 = new Label ( " Surname ");


        l1.setBounds(60,100,100,30);

        l2.setBounds(60,150,100,30);

        f.add(l1);
        f.add(l2);

        f.setSize(200,200);
        f.setLayout(null);

        f.setVisible(true);

    }
}
