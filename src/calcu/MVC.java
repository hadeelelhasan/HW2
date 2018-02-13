package calcu;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
public class MVC  extends Runner{

	public static void main(String[] args) {
		
		View v=new View();
		model m=new model();
		controller cont =new controller(v,m);
                v.setVisible(true);
	}

    @Override
    public Description getDescription() {
     return null;
    }

    @Override
    public void run(RunNotifier rn) {
    System.out.printf("run");
    }

}
