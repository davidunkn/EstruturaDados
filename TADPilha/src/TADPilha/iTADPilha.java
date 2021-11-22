package TADPilha;

public interface iTADPilha {
	
	public void push(Object o);
	public Object pop() throws EPilhaVazia;
	public Object top() throws EPilhaVazia;
	public boolean isEmpty();
	public int size();	
}
