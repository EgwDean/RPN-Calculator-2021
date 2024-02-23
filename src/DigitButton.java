import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

public class DigitButton extends Button
{
	public DigitButton(String string, int i , int j, int k, int l)
	{
			super(string);
			this.setBounds(i, j, k, l);
			this.setFont(new Font("TimesRoman", Font.PLAIN, 14));
			this.setForeground(Color.black);
			switch(string)
			{
			case "+": this.addActionListener(new ButtonPlusHandler(string)); break;
			case "-": this.addActionListener(new ButtonMinusHandler(string)); break;
			case "*": this.addActionListener(new ButtonMulHandler(string)); break;
			case "/": this.addActionListener(new ButtonDivHandler(string)); break;
			case "=": this.addActionListener(new ButtonEqualsHandler(string)); break;
			case "ENTER": this.addActionListener(new ButtonEnterHandler(string)); break;
			case "BACK": this.addActionListener(new ButtonBackSpaceHandler(string)); break;
			default: this.addActionListener(new ButtonHandler(string)); break;
			}
	}
}