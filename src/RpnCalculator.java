import java.util.Stack;

public class RpnCalculator
{
	static Stack<Double> st;
	static RpnCalculatorGui cg;
	static Operand op;
	static Adder add;
	static Subtracter sub;
	static Multiplier mul;
	static Divider div;
	static ResultPresenter rp;
	
	public static void main(String[] args)
	{
		st = new Stack<Double>();
		op = new Operand(st);
		add = new Adder(st);
		sub = new Subtracter(st);
		mul = new Multiplier(st);
		div = new Divider(st);
		rp = new ResultPresenter(st);
		cg = new RpnCalculatorGui("RPN Calculator", op, add, sub, mul, div, rp);
		
	}
}