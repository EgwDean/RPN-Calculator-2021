import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBackSpaceHandler implements ActionListener
{	
	String s;
	
	public ButtonBackSpaceHandler(String s)
	 {
		 this.s = s;
	 }
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		RpnCalculator.op.deleteLastDigit();
	}
}