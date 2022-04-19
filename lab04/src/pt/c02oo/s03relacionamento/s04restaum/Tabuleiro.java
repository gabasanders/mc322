package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	
	char Tabuleiro[][];
	Peca Posicoes[][];
	
	Tabuleiro(){
		char Board[][] = {
		         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
		         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
		         {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
		         {'P', 'P', 'P', '-', 'P', 'P', 'P'},
		         {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
		         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
		         {' ', ' ', 'P', 'P', 'P', ' ', ' '}
		      };
		
		this.Tabuleiro = Board;
	
		this.Posicoes = new Peca[7][7];
		
		for (int  i = 0; i<7;i++) {
			
			for( int j = 0; j < 7; j++) {
				
				this.Posicoes[i][j] = new Peca(i,j);
										
				}
			}
		}
		
	// f4:d4
	public void MovePeca(String Movimento) {
		//Posicao Inicial
		char letraInicio = Movimento.charAt(0);
		char letrafinal = Movimento.charAt(3);
		
		int xi = letraInicio - 'a';
		int yi =  Character.getNumericValue(Movimento.charAt(1));
		
		int Xf = letrafinal - 'a';
		int Yf = Character.getNumericValue(Movimento.charAt(4));
		
		if (this.Posicoes[xi][yi - 1].Move(Xf, Yf - 1, this) == 2) {
			Posicoes[xi][yi - 1].Validade = "Livre";

			
			Posicoes[Xf][Yf - 1].Validade = "Ocupado";	
		}
			
		}
	
	public void EstadoAtual() {
		for (int i = 0;i<7;i++) {
			for (int j= 0; j<7;j++) {
				if (this.Posicoes[i][j].Validade.equals("Ocupado")){
					this.Tabuleiro[j][i] = 'P';
				}
				else if(this.Posicoes[i][j].Validade.equals("Livre")) {
					this.Tabuleiro[j][i] = '-';
				}
				else {
					this.Tabuleiro[j][i] = ' ';
				}
			}
		}
		
	}
}
