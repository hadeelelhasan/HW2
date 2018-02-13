package calcu;


public class model {
	private double res;
    private double check;
public void add(double num1,double num2){
	
	 res=num1+num2;
	 
}

public void sub(double num1,double num2)
{
	res=num1-num2;
}
public void mul(double num1,double num2)
{
	res=num1*num2;
}
public void div(double num1,double num2)
{
	
  if (num2==0)
  {
	  check=1;
	 // JOptionPane.showMessageDialog(null,"divide on zero");
  } 
  else
	res=num1/num2;
}
public void mod(double num1,double num2)
{
	if (num2==0)
	{
		check=1;
	    //JOptionPane.showMessageDialog(null,"mod on zero");

	}
	else
	res=num1%num2;
}

public void sq(double num1)
{
	if(num1<0)
	{
		check=1;
		//JOptionPane.showMessageDialog(null,"you should enter positive number for square root");
		
	}
	else	
	res = Math.sqrt(num1);
	
}


public double  getTheRes()
{  
	
	return res;
}

public void  setTheRes(double re)
{  
	
	res=re;
}
public double  getCheck()
{  
	
	return check;
}

public void  setCheck(double re)
{  
	
	check=re;
}

}
