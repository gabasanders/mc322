package pt.c02oo.s03relacionamento.s04restaum;

public class Peca {
	int PosicaoAtual[];
	String Validade;//Livre,Ocupada,Invalida

	
	Peca(int i,int j){
		this.PosicaoAtual = new int[2];
		
		this.PosicaoAtual[0] = i; 
		this.PosicaoAtual[1] = j;
		
		if ((i < 2  || i > 4) && (j < 2 || j > 4)) {
			this.Validade = "Invalida";
		}
		else if(i == 3 && j== 3) {
			this.Validade = "Livre";
		}
		else {
			this.Validade = "Ocupado";
		}
	}
	
	public int Move(int Xf, int Yf, Tabuleiro Tab) {//Se der pra se mover, retorna 2, se não der, 0 ou 1
		int Soma = 0;
		
		if (Xf - this.PosicaoAtual[0] == 0 && Yf - this.PosicaoAtual[1] == 0) {//Se não se move em nenhuma direcao, retona 0

			return Soma;
		}
		
		if (Xf - this.PosicaoAtual[0] != 0 && Yf - this.PosicaoAtual[1] != 0) {//Se ele se move em mais de uma diracao(diagonal), retorna 0;

			return Soma;
		}
		
		if (Tab.Posicoes[Xf][Yf].Validade.equals("Livre") && this.Validade.equals("Ocupado")){//Se a Posicao de destino estiver livre, e 
			Soma++;																			  //essa estiver ocupada, soma 1
		}
		
		if(this.PosicaoAtual[0] != Xf ){//Verifica se tem uma peça entre o inicio e o destino para o deslocamento no eixo x e a elimina
			if (Xf - this.PosicaoAtual[0] < 0) {
				if(Tab.Posicoes[this.PosicaoAtual[0] - 1][Yf].Validade.equals("Ocupado")) {
					Tab.Posicoes[this.PosicaoAtual[0] - 1][Yf].Validade = "Livre";
					Soma++;
				}
			}
			else {
				if(Tab.Posicoes[this.PosicaoAtual[0] + 1][Yf].Validade.equals("Ocupado")) {
					Tab.Posicoes[this.PosicaoAtual[0] + 1][Yf].Validade = "Livre";
					Soma++;
				}
			}	
		}
		
		if(this.PosicaoAtual[1] != Yf ){//Verifica se tem uma peça entre o inicio e o destino para o deslocamento no eixo y e a elimina
			if (Yf - this.PosicaoAtual[1] < 0) {
				if(Tab.Posicoes[Xf][this.PosicaoAtual[1] - 1].Validade.equals("Ocupado")) {
					Tab.Posicoes[Xf][this.PosicaoAtual[1] - 1].Validade = "Livre";
					Soma++;
				}
			}
			else {
				if(Tab.Posicoes[Xf][this.PosicaoAtual[1] + 1].Validade.equals("Ocupado")) {
					Tab.Posicoes[Xf][this.PosicaoAtual[1] + 1].Validade = "Livre";
					Soma++;
				}
			}
			
		}
	
		return Soma;
	}
	
		
}


