import java.awt.*;
import java.awt.event.*;

public class RpnCalculatorGui extends Frame
{
	static TextField display;
	
	static DigitButton buttonadd;
	static DigitButton buttonsub;
	static DigitButton buttonmul;
	static DigitButton buttondiv;
	static DigitButton buttoneq;
	
	static DigitButton buttonenter;
	static DigitButton buttonback;
	static Button buttonc;
	
	static DigitButton buttonpoint;
	
	static DigitButton button0;
	static DigitButton button1;
	static DigitButton button2;
	static DigitButton button3;
	static DigitButton button4;
	static DigitButton button5;
	static DigitButton button6;
	static DigitButton button7;
	static DigitButton button8;
	static DigitButton button9;
	
	public RpnCalculatorGui(String title, Operand op, Adder add, Subtracter sub, Multiplier mul, Divider div, ResultPresenter rp)
	{
		super(title);
		
		RpnCalculator.op = op;
		RpnCalculator.add = add;
		RpnCalculator.sub = sub;
		RpnCalculator.mul = mul;
		RpnCalculator.div = div;
		RpnCalculator.rp = rp;
		
		this.setLayout(null);
		this.setFont(new Font("TimesRoman", Font.BOLD, 20));
		this.setBackground(Color.black);
		
		buttonadd = new DigitButton("+", 35, 265, 35, 28);
		this.add(buttonadd);
		
		buttonsub = new DigitButton("-", 81, 265, 35, 28);
		this.add(buttonsub);
		
		buttonmul = new DigitButton("*", 127, 265, 35, 28);
		this.add(buttonmul);
		
		buttondiv = new DigitButton("/", 173, 265, 35, 28);
		this.add(buttondiv);
		
		buttoneq = new DigitButton("=", 219, 265, 35, 28);
		this.add(buttoneq);
		
		buttonpoint = new DigitButton(".", 35, 208, 35, 28);
		this.add(buttonpoint);
		
		buttonenter = new DigitButton("ENTER", 185, 100, 55, 28);
		this.add(buttonenter);
		
		buttonback = new DigitButton("BACK", 185, 136, 55, 28);
		this.add(buttonback);
		
		buttonc = new Button("C");
		buttonc.setBounds(185, 172, 55, 28);
		buttonc.setFont(new Font("TimesRoman", Font.BOLD, 14));
	    buttonc.setForeground(Color.red);
	    buttonc.addActionListener(new ButtonCHandler("C"));
		this.add(buttonc);
		
		/*buttonc is supposed to be red and as color is not one
		of DigitButton's arguments I manually set it up here. */
		
		button0 = new DigitButton("0", 81, 208, 35, 28);
		this.add(button0);
		button1 = new DigitButton("1", 35, 172, 35, 28);
		this.add(button1);
		button2 = new DigitButton("2", 81, 172, 35, 28);
		this.add(button2);
		button3 = new DigitButton("3", 127, 172, 35, 28);
		this.add(button3);
		button4 = new DigitButton("4", 35, 136, 35, 28);
		this.add(button4);
		button5 = new DigitButton("5", 81, 136, 35, 28);
		this.add(button5);
		button6 = new DigitButton("6", 127, 136, 35, 28);
		this.add(button6);
		button7 = new DigitButton("7", 35, 100, 35, 28);
		this.add(button7);
		button8 = new DigitButton("8", 81, 100, 35, 28);
		this.add(button8);
		button9 = new DigitButton("9", 127, 100, 35, 28);
		this.add(button9);
		
		display = new TextField("0");
		display.setEditable(false);
		display.setBounds(13, 40, 257, 30);
		this.add(display);
		
		this.setSize(283, 320);
		this.setLocation(40, 80);
		this.setVisible(true);
		this.setResizable(false);
		this.addWindowListener(new CloseWindowAndExit());
	}
	
	class CloseWindowAndExit extends WindowAdapter
	{
		public void windowClosing(WindowEvent closeWindowAndExit)
		{
			System.exit(0);
		}
	}
}