package calcu;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class View extends JFrame{
	
private final JTextField number1=new JTextField(10);
private final JLabel addi=new JLabel ("+");
private final JTextField number2=new JTextField(10);
 JButton calculate=new JButton("add");
private final JTextField ans=new JTextField(10);

private final JTextField number3=new JTextField(10);
private final JLabel subi=new JLabel ("-");
private final JTextField number4=new JTextField(10);
 JButton calculate1=new JButton("sub");
private final JTextField ans1=new JTextField(10);

private final JTextField number5=new JTextField(10);
private final JLabel muli=new JLabel ("*");
private final JTextField number6=new JTextField(10);
 JButton calculate2=new JButton("mul");
private final JTextField ans2=new JTextField(10);

private final JTextField number7=new JTextField(10);
private final JLabel divi=new JLabel ("/");
private final JTextField number8=new JTextField(10);
 JButton calculate3=new JButton("div");
private final JTextField ans3=new JTextField(10);


private final JTextField number9=new JTextField(10);
private final JLabel modi=new JLabel ("%");
private final JTextField number10=new JTextField(10);
 JButton calculate4=new JButton("mod");
private final JTextField ans4=new JTextField(10);

private final JLabel sqri=new JLabel ("squer");
private final JTextField number11=new JTextField(10);
 JButton calculate5=new JButton("squr");
private final JTextField ans5=new JTextField(10);
private DecimalFormat DF = new DecimalFormat("##.##");
View()
{
	JPanel calcPanel=new JPanel();
	
calcPanel.add(number1);
calcPanel.add(addi);
calcPanel.add(number2);
calcPanel.add(calculate);
calcPanel.add(ans);


calcPanel.add(number3);
calcPanel.add(subi);
calcPanel.add(number4);
calcPanel.add(calculate1);
calcPanel.add(ans1);

calcPanel.add(number5);
calcPanel.add(muli);
calcPanel.add(number6);
calcPanel.add(calculate2);
calcPanel.add(ans2);

calcPanel.add(number7);
calcPanel.add(divi);
calcPanel.add(number8);
calcPanel.add(calculate3);
calcPanel.add(ans3);

calcPanel.add(number9);
calcPanel.add(modi);
calcPanel.add(number10);
calcPanel.add(calculate4);
calcPanel.add(ans4);


//calcPanel.add(sqri);
calcPanel.add(number11);
calcPanel.add(calculate5);
calcPanel.add(ans5);




this.add(calcPanel);
this.setSize(500,400);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public double getNumber1()

{
	
	return Double.parseDouble(number1.getText());

	
}
public double getNumber2()
{
	return Double.parseDouble(number2.getText());
	
}

public double getNumber3()
{
	return Double.parseDouble(number3.getText());
	
}
public double getNumber4()
{
	return Double.parseDouble(number4.getText());
	
}

public double getNumber5()
{
	return Double.parseDouble(number5.getText());
	
}

public double getNumber6()
{
	return Double.parseDouble(number6.getText());
	
}
public double getNumber7()
{
	return Double.parseDouble(number7.getText());
	
}


public double getNumber8()
{
	return Double.parseDouble(number8.getText());
	
}
public double getNumber9()
{
	return Double.parseDouble(number9.getText());
	
}

public double getNumber10()
{
	return Double.parseDouble(number10.getText());
	
}

public double getNumber11()
{
	return Double.parseDouble(number11.getText());
	
}

public double getAns()
{
	return Double.parseDouble(ans.getText());
	
}

public double getAns1()
{
	return Double.parseDouble(ans1.getText());
	
}

public double getAns2()
{
	return Double.parseDouble(ans2.getText());
	
}

public double getAns3()
{
	return Double.parseDouble(ans3.getText());
	
}
public double getAns4()
{
	return Double.parseDouble(ans4.getText());
	
}


public double getAns5()
{
	return Double.parseDouble(ans5.getText());
	
}

public void setAns(double answer)
{
	ans.setText(DF.format(answer));
	
}

public void setAns1(double answer)
{       
	ans1.setText(DF.format(answer));
	
}
public void setAns2(double answer)
{
	ans2.setText(DF.format(answer));
	
}

public void setAns3(double answer)
{
	ans3.setText(DF.format(answer));
	
}

public void setAns4(double answer)
{
	ans4.setText(DF.format(answer));
	
}

public void setAns5(double answer)
{
	ans5.setText(DF.format(answer));
	
}

void addCalcListener(ActionListener L)
{
	calculate.addActionListener(L);
	calculate1.addActionListener(L);
	calculate2.addActionListener(L);
	calculate3.addActionListener(L);
	calculate4.addActionListener(L);
	calculate5.addActionListener(L);
}


}