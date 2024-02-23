import java.util.Stack;

public class Operand
{
    Stack<Double> st;
    private StringBuffer sb;
    
    public Operand(final Stack<Double> st) 
    {
        this.sb = new StringBuffer();
        this.st = st;
    }
    
    private void showVal() 
    {
    	System.out.println(this.sb);
        RpnCalculatorGui.display.setText(this.sb.toString());
    }
    public void addDigit(final String s) 
    {
        this.sb.append(s);
        this.showVal();
    }
    
    public void deleteLastDigit() 
    {
        if (this.sb.length() > 0) 
        {
            this.sb.deleteCharAt(this.sb.length() - 1);
            this.showVal();
        }
    }
    
    public void reset() 
    {
        this.sb.setLength(0);
        this.st.removeAllElements();
        this.showVal();
    }
    
    public void complete() 
    {
        if (this.sb.length() > 0) 
        {
            this.st.push(Double.parseDouble(this.sb.toString()));
            this.sb.delete(0, this.sb.length());
            this.showVal();
        }
    }

}