import java.applet.Applet;//Applet is class and applet is package
import java.awt.*;  //for components like textfield ,labels,buttons
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*<applet code="MyApplet" width="300" height="400"></applet>*/
public class Calc extends Applet 
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
public void init()
{
	l1=new Label("Enter First Number");
	l2=new Label("Enter Second Number");
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	b1=new Button("ADD");
	b2=new Button("SUBTRACT");
	b3=new Button("MULTIPLY");
	b4=new Button("DIVISION");
	l3=new Label();
	setLayout(null);/* set layout null otherwise it will set default
	 layout and hence no meaning of setBounds*/
	l1.setBounds(30,50,200,20);
	l2.setBounds(30,100,200,20);
	t1.setBounds(400,50,100,20);
	t2.setBounds(400,100,100,20);
	b1.setBounds(100,150,100,20);
	b2.setBounds(100,200,100,20);
	b3.setBounds(100,250,100,20);
	b4.setBounds(100,300,100,20);
	t3.setBounds(400,150,100,20);
	add(t1);
	add(l1);
	add(b1);
	add(l2);
	add(t2);
	add(t3);
	add(b2);
	add(b3);
	add(b4);
	b1.addActionListener(new MyHandler());
	b2.addActionListener(new MyHandler1());
	b3.addActionListener(new MyHandler2());
	b4.addActionListener(new MyHandler3());
}
	public class MyHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,s=0;
			a=Integer.parseInt(t1.getText());//returns string
			b=Integer.parseInt(t2.getText());
			s=a+b;
			t3.setText(String.valueOf(s));
		}
	}
	public class MyHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,s=0;
			a=Integer.parseInt(t1.getText());//returns string
			b=Integer.parseInt(t2.getText());
			s=a-b;
			t3.setText(String.valueOf(s));
		}
	}
	public class MyHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,s=0;
			a=Integer.parseInt(t1.getText());//returns string
			b=Integer.parseInt(t2.getText());
			s=a*b;
			t3.setText(String.valueOf(s));
		}
	}
	public class MyHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,s=0;
			a=Integer.parseInt(t1.getText());//returns string
			b=Integer.parseInt(t2.getText());
			s=a/b;
			t3.setText(String.valueOf(s));
		}
	}
}
