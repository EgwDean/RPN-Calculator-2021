import java.util.Stack;

public class Subtracter
{
	Stack<Double> st;
	
	public Subtracter(Stack<Double> st)
	{
		this.st = st;
	}
	
	public void operate()
	{
		st.push(st.pop() - st.pop());
	}
}