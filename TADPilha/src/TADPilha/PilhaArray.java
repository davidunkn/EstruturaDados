package TADPilha;

public class PilhaArray implements iTADPilha {
	
	private int capacity;
	private Object[] a;
	private int t;
	private int FC;
	
	public PilhaArray(int capacidade, int crescimento)
	{
		this.capacity = capacidade;
		this.FC = crescimento;
		this.t = -1;
		if(this.FC <= 0)
			this.FC = 0;
		a = new Object[capacidade];
	}

	/**
	 * Método para adicionar um elemento a pilha
	 * 
	 * @param Object Objeto
	 */
	public void push(Object o)
	{
		if(this.t >= this.capacity-1) {
			if(this.FC == 0)
				this.capacity *= 2;
			else
				this.capacity += this.FC;
			Object b[] = new Object[this.capacity];
			for(int i=0;i<this.a.length;i++)
				b[i] = this.a[i];
			this.a = b;
		}
		this.a[++this.t] = o;
	}
	
	/**
	 * Método para retirar um elemento da pilha
	 * 
	 * @return Object
	 * @throws EPilhaVazia Exceção caso a pilha esteja vazia
	 */
	public Object pop() throws EPilhaVazia
	{
		if(this.isEmpty())
				throw new EPilhaVazia("A pilha está vazia");
		else
			this.t = this.t - 1;
		
		return this.a[this.t+1];
	}
	
	/**
	 * Método para receber o último elemento da pilha
	 * 
	 * @return Object
	 * @throws EPilhaVazia Exceção caso a pilha esteja vazia
	 */
	public Object top() throws EPilhaVazia
	{
		if(this.isEmpty())
			throw new EPilhaVazia("A pilha está vazia.");
		
		return this.a[this.t];
	}
	
	/**
	 * Método para verificar se a pilha está vazia
	 * 
	 * @return bool
	 */
	
	public boolean isEmpty()
	{
		return this.t < 0;
	}
	
	/**
	 * Método para retornar o tamanho da pilha
	 * 
	 * @return int	tamanho
	 */
	
	public int size()
	{
		return this.t + 1;
	}
}
