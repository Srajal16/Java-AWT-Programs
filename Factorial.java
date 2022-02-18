import java.awt.*;
import java.awt.event.*;

class Factorial extends Frame implements ActionListener
{
    TextField tf;
    Button b;
    Label n, l, r;
    Factorial()
    {
        n = new Label("AWT Factorial Program");
        l = new Label("Enter number");
        r = new Label();

        tf = new TextField();

        b = new Button("Factorial");
//itvoyagers.in
        n.setBounds(30, 40, 200, 20);
        l.setBounds(30, 70, 150, 20);
        r.setBounds(30, 170, 200, 20);

        tf.setBounds(30, 90, 190, 30);

        b.setBounds(30, 130, 190, 30);

        add(n);
        add(l);
        add(r);
        add(tf);
        add(b);

        setSize(250,210);
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible

        b.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    //itvoyagers.in
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            int num = Integer.parseInt(tf.getText());
            r.setText("Factorial of "+num+" is "+getFactorial(num));
        }
    }

    public int getFactorial(int x)
    {
        int rsl = 1;
        for(int i = x; i > 0; --i)
        {
            rsl *= i;
        }
        return(rsl);
    }
    //itvoyagers.in
    public static void main(String[] args)
    {
        Factorial factorial = new Factorial();
    }
}
