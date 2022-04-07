package s03lombriga;
public class Animacao {
	String MovimentosLombriga;
	AquarioLombriga Lombriga;
	int NumeroMovimentos;
	
	Animacao(String OrdemDeAnimacao){
		
		String TamanhoDoAquario = OrdemDeAnimacao.substring(0, 2);
		int TamanhoAquario = Integer.parseInt(TamanhoDoAquario);
		
		String TamanhoDaLombriga = OrdemDeAnimacao.substring(2, 4);
		int TamanhoLombriga = Integer.parseInt(TamanhoDaLombriga);
		
		String Posicao = OrdemDeAnimacao.substring(4, 6);
		int LocalInicial = Integer.parseInt(Posicao);
		
		this.Lombriga = new AquarioLombriga(TamanhoAquario,TamanhoLombriga, LocalInicial);
		
		String Movimentos = OrdemDeAnimacao.substring(6, OrdemDeAnimacao.length());
		this.MovimentosLombriga = Movimentos;
		this.NumeroMovimentos = OrdemDeAnimacao.length() - 6;
		
	}
	
	
void Passo(String Movimento){

		if (Movimento.equals("M")) {
			this.Lombriga.Mover();
		}
		
		else if(Movimento.equals("C")) {
			this.Lombriga.Crescer();
		}
		
		else if(Movimento.equals("V"))
			this.Lombriga.Virar();
			
	}


	void Apresenta() {
		int i = 0;
		int j = 1;
		
		this.Lombriga.Apresenta();
		System.out.println();
		
		while(j <= this.NumeroMovimentos) {
			
			this.Passo(this.MovimentosLombriga.substring(i, j));
			
			this.Lombriga.Apresenta();
			System.out.println();
			i++;
			j++;
			
		}
		
		
		
	}
		
	
	

}
