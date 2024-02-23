import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener
{	
	String s;
	
	public ButtonHandler(String s)
	 {
		 this.s = s;
	 }
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(this.s);
		RpnCalculator.op.addDigit(this.s);
	}
}