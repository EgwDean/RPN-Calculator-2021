import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEqualsHandler implements ActionListener
{	
	String s;
	
	public ButtonEqualsHandler(String s)
	 {
		 this.s = s;
	 }
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(this.s);
		RpnCalculator.rp.operate();
	}
}