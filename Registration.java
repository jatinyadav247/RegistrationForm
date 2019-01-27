import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
	JLabel label1,label2,label3,label4,label5;
	JTextField t1,t2;
	JRadioButton male,female;
	JComboBox<String> day,month,year;
	JTextArea ta1;
	JCheckBox terms;
	JButton submit;
	JLabel message;
	JTextArea screen;
	
	MyFrame()
	{
		setTitle("Registration Form");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		label1 = new JLabel("name");
		label1.setBounds(20, 50, 100, 20);
		c.add(label1);
		t1 = new JTextField();
		t1.setBounds(130,50,100,20);
		c.add(t1);
		label2 = new JLabel("mobile no");
		label2.setBounds(20, 100, 100, 20);
		c.add(label2);
		t2 = new JTextField();
		t2.setBounds(130,100,100,20);
		c.add(t2);
		label3 = new JLabel("gender");
		label3.setBounds(20,150,100,20);
		c.add(label3);
		male = new JRadioButton("male");
		female = new JRadioButton("female");
		male.setBounds(130,150,80,20);
		female.setBounds(220,150,80,20);
		male.setSelected(true);
		c.add(male);
		c.add(female);
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		label4 = new JLabel("DOB");
		label4.setBounds(20, 200, 100, 20);
		c.add(label4);
		String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months[]= {"jan","feb","march","apr","may","jun","july","aug","sep","oct","nov","dec"};
		String years[]= {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000"};
		day = new JComboBox(days);
		month = new JComboBox(months);
		year = new JComboBox(years);
		
		day.setBounds(130, 200, 50,20);
		month.setBounds(190, 200, 50, 20);
		year.setBounds(250, 200, 60, 20);
		c.add(day);
		c.add(month);
		c.add(year);
		label5 = new JLabel("address");
		label5.setBounds(20,250,100,20);
		c.add(label5);
		ta1 = new JTextArea();
		ta1.setBounds(130,240,200,50);
		c.add(ta1);
		
		terms = new JCheckBox("accept terms nd condition");
		terms.setBounds(50,300,250,20);
		c.add(terms);
		
		submit = new JButton("submit");
		submit.setBounds(150,350,80,20);
		c.add(submit);
		submit.addActionListener(this);
		screen = new JTextArea();
		screen.setBounds(350,50,300,300);
		c.add(screen);
		message = new JLabel();
		message.setBounds(20,400,250,20);
		c.add(message);
		c.setBackground(Color.magenta);
		
		
		
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(terms.isSelected())
		{message.setText("registeration succesful");
		String name = t1.getText();
		String mobile = t2.getText();
		String gender = "male";
		if(female.isSelected()) {gender = "female";}
		String DOB=day.getSelectedItem()+"--"+month.getSelectedItem()+"--"+year.getSelectedItem();
		String address = ta1.getText();
		screen.setText("Name :"+name+"\n"+"Mobile :"+mobile+"\n"+"Gender :"+gender+"\n"+"DOB:"+DOB+"\n"+"Address :"+address);
		}
		else {
			message.setText("accept term nd condition to submit");
			screen.setText("");
		}
	}
}

public class Registration {

	public static void main(String[] args) {
	MyFrame frame	= new MyFrame();

	}

}
