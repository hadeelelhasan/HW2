package calcu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class controller {
private View v=new View();
private model m=new model();

public controller(View v,model m)
{
	this.v=v;
	this.m=m;
	this.v.addCalcListener(new CalcListener());
	

  

}
class CalcListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		double first,second;
		JButton actionButton = (JButton) e.getSource();
			switch (actionButton.getText()){
                            case "add":
                                try {
                                    first=v.getNumber1();
                                    second=v.getNumber2();
                                    m.add(first, second);
                                    m.getTheRes();
                                    v.setAns(m.getTheRes());
                                    }
                                catch(NumberFormatException e3){
				m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
				//v.setAns(m.getTheRes());
                                }
                            break;
                            
                            case "sub":
                                try {
                                    first=v.getNumber3();
                                    second=v.getNumber4();
                                    m.sub(first, second);
                                    m.getTheRes();
                                    v.setAns1(m.getTheRes());
                                    }
                                catch(NumberFormatException e2) {
				m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
                                }
                            break;
                            
                            case "mul" :
                                try {
                                    first=v.getNumber5();
                                    second=v.getNumber6();
                                    m.mul(first, second);
                                    m.getTheRes();
                                    v.setAns2(m.getTheRes());
                                    }
                                catch(NumberFormatException e2){
				m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
                                }
                            break;
                            case "div":
                                try {	
                                    first=v.getNumber7();
                                    second=v.getNumber8();
                                    m.div(first, second);
                                    m.getTheRes();
                                    if (m.getCheck()!=1) 
                                        v.setAns3(m.getTheRes());
                                    }
                                catch(NumberFormatException e4) {
                                    m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
                                    }
                            break;
                            
                            case "mod":
                                try {
                                    first=v.getNumber9();
                                    second=v.getNumber10();
                                    m.mod(first, second);
                                    m.getTheRes();
                                    if (m.getCheck()!=1) 
                                        v.setAns4(m.getTheRes());
                                    }
                                catch(NumberFormatException e5) {
                                    m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
                                }
                            break;
                            case "squr":
                                try {
                                    first=v.getNumber11();
                                    m.sq(first);
                                    m.getTheRes();
                                    if (m.getCheck()!=1) 
                                        v.setAns5(m.getTheRes());
                                    }
                                catch(NumberFormatException e6) {
                                    m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
                                }
                                break;
                        }
	}
	
}
}
