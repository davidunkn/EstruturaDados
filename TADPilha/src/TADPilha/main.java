package TADPilha;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilhaArray teste = new PilhaArray(5, 2);
		
		System.out.println("Está vazia: "+ teste.isEmpty());
		
		teste.push("Teste 1");
		teste.push("Teste 2");
		teste.push("Teste 3");
		teste.push("Teste 4");
		
		System.out.println("Tamanho: "+ teste.size());
		System.out.println("Último elemento: "+ teste.top());
		try{
			teste.pop();
			teste.pop();
			teste.pop();
			teste.pop();
			teste.pop();
		}catch(EPilhaVazia e) {
			System.out.println("Ocorreu um erro: "+ e.getMessage());
		}
		
		System.out.println("Último elemento: "+ teste.top());
	}

}