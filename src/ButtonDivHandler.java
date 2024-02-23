import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonDivHandler implements ActionListener
{
	String s;
	
	public ButtonDivHandler(String s)
	{
		this.s = s;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		RpnCalculator.div.operate();
	}
}