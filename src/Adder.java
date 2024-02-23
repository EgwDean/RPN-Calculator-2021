import java.util.Stack;

public class Adder
{
	Stack<Double> st;
	
	public Adder(Stack<Double> st)
	{
		this.st = st;
	}
	
	public void operate()
	{
		st.push(st.pop() + st.pop());
	}
}