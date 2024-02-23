import java.util.Stack;

public class Divider
{
	Stack<Double> st;
	
	public Divider(Stack<Double> st)
	{
		this.st = st;
	}
	
	public void operate()
	{
		double x, y;
		
		x = st.pop();
		y = st.pop();
		
		st.push(y / (double)x);
		
		/*I switch x and y because when you retrieve them from the
		stack they come in reversed order and to get the value of
		x/y someone would have to type y/x.*/
	}
}