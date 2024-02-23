import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonPlusHandler implements ActionListener
{
	String s;
	
	public ButtonPlusHandler(String s)
	{
		this.s = s;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		RpnCalculator.add.operate();
	}
}