
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonMinusHandler implements ActionListener
{
	String s;
	
	public ButtonMinusHandler(String s)
	{
		this.s = s;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		RpnCalculator.sub.operate();
	}
}