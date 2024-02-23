import java.util.Stack;

public class Multiplier
{
	Stack<Double> st;
	
	public Multiplier(Stack<Double> st)
	{
		this.st = st;
	}
	
	public void operate()
	{
		st.push(st.pop() * st.pop());
	}
}