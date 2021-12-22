import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class sanjiban extends Applet implements ActionListener {
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    Choice c1 = new Choice();
    Choice c2 = new Choice();
    Button b1 = new Button("Calculate");

    public void init(){
        c1.add("Select");
        c1.add("Celsius");
        c1.add("Fahrenheit");
        c2.add("Select");
        c2.add("Celsius");
        c2.add("Fahrenheit");
        add(t1);
        add(t2);
        add(c1);
        add(c2);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            double d1,d2;
            if(c1.getSelectedItem()=="Celsius" && c2.getSelectedItem()=="Fahrenheit"){
                d1 = Double.parseDouble(t1.getText());
                d2 = (d1*9/5)+32;
                t2.setText(String.valueOf(d2));
            }
            else if(c1.getSelectedItem()=="Fahrenheit" && c2.getSelectedItem()=="Celsius"){
                d1 = Double.parseDouble(t1.getText());
                d2 = (d1-32)*5/9;
                t2.setText(String.valueOf(d2));
            }
        }
    } 

}

/* 
<applet code="sanjiban.class" width="1000" height="1000"> 
</applet> 
*/