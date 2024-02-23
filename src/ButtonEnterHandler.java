import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEnterHandler implements ActionListener
{	
	String s;
	
	public ButtonEnterHandler(String s)
	 {
		 this.s = s;
	 }
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		RpnCalculator.op.complete();
	}
}