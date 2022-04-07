package s03Lombriga;
public class AquarioLombriga {
	int TamanhoAquario;
	int TamanhoLombriga;
	int LocalInicial;
	int Posicao;
	int Direcao; // 0  é esquerda e 1 é direita
	
	AquarioLombriga(int TamanhoAquario,int TamanhoLombriga, int LocalInicial) {
		this.TamanhoAquario = TamanhoAquario;
		this.TamanhoLombriga = TamanhoLombriga;
		this.LocalInicial = LocalInicial;
		this.Posicao = LocalInicial;
		this.Direcao = 0;
	}
	
	void Crescer() {
		if (this.Direcao == 1) {
			if ((this.Posicao - this.TamanhoLombriga) > 0) {
				this.TamanhoLombriga++;
			}
		}
		else {
			if ((this.Posicao + this.TamanhoLombriga) <= this.TamanhoAquario) {
				this.TamanhoLombriga++;
			}
		}
	}
		
	
	
	void Mover() {
		if (this.Posicao == 1  || this.Posicao == this.TamanhoAquario) {
			this.Virar();
		}
		
		else {
				
			if (this.Direcao == 0) {
				this.Posicao--;
			}
			
			else {
				this.Posicao++;
			}
	}
}
	
	void Virar() {
		if (this.Direcao == 0) {
			this.Direcao = 1;
			this.Posicao = this.Posicao + this.TamanhoLombriga - 1;
		}
		else {
			this.Direcao = 0;
			this.Posicao = this.Posicao - this.TamanhoLombriga + 1;
		}
	}
	
	void Apresenta() {
			for(int x = 1;x < this.TamanhoAquario + 1;x++) {
				
				if (Direcao == 0) {
					
					if (x < this.Posicao     ||     x > this.Posicao + this.TamanhoLombriga - 1 ) {
						System.out.printf("#");
					}
					
					else if(x == this.Posicao) {
						System.out.printf("O");
					}
					
					else {
						System.out.printf("@");
					}
				}
				
				else {
					
					if (x < this.Posicao - this.TamanhoLombriga + 1     ||    x > this.Posicao) {
						System.out.printf("#");
					}
					
					else if(x == this.Posicao) {
						System.out.printf("O");
					}
					
					else {
						System.out.printf("@");
					}
										
				}
				
				
				
			}
	}
}
