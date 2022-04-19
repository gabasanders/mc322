
package pt.c02oo.s03relacionamento.s04restaum;

public class AppRestaUm {

   public static void main(String[] args) {
      AppRestaUm.executaJogo(null, null);
   }
   
   public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
      Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);
      
      String commands[] = tk.retrieveCommands();
      
      Tabuleiro teste = new Tabuleiro();
      
      
      
      for (int l = 0; l < commands.length; l++)
    	 
         System.out.println(commands[l]);
      
      
      System.out.println();
            
      tk.writeBoard("Tabuleiro inicial", teste.Tabuleiro);
      
      System.out.println();
      
      for (int i = 0;i < commands.length; i++ ) {
    	  teste.MovePeca(commands[i]);
    	  teste.EstadoAtual();
    	  tk.writeBoard(commands[i], teste.Tabuleiro);
    	  System.out.println();
    	  
    	  
      }
    	 
      tk.stop();
   }
   

}
