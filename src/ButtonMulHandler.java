import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonMulHandler implements ActionListener
{
	String s;
	
	public ButtonMulHandler(String s)
	{
		this.s = s;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		RpnCalculator.mul.operate();
	}
}