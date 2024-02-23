import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCHandler implements ActionListener
{	
	String s;
	
	public ButtonCHandler(String s)
	 {
		 this.s = s;
	 }
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		RpnCalculator.op.reset();
	}
}