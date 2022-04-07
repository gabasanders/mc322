package lab03Lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      
      Animacao Animacao1 = new Animacao("050401MMMC");
      
      Animacao1.Apresenta();
      
      
      tk.stop();
   }

}
