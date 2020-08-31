import java.util.Random;

public class MainClass{
    
    public static void main(String[] args ){

  
      Random aleatorio = new Random(); 
      String[] tipoCarga = new String[] {"VUC", "3/4", "Toco", "Truck", "Bitruck", "Cavalo mecanico 4x2"};
      String[] marcaVeiculo = new String[] {"Ford", "Honda", "Peugeot", "Volkswagen"};
      String[] categoria = new String[] {"Carro", "Moto", "Caminhao"};

      Carro carro = new Carro();
      Veiculo moto = new Veiculo();
      Moto moto2 = new Moto();
      Caminhao caminhao = new Caminhao();
      Veiculo[] meusVeiculos = new Veiculo[5];
      String[] teste = new String[5];

      /*for(int i = 0; i < 5; i++){
        int var = aleatorio.nextInt(3);
        if(var == 0) {
          System.out.println("Saiu Carro...: "+var);
          meusVeiculos[i] = new Carro();
          meusVeiculos[i].exibirInfo();
        }
        if(var == 1) {
          meusVeiculos[i] = new Moto();
          System.out.println("Saiu Moto...: "+var);
          meusVeiculos[i].exibirInfo();
        }
        if(var == 2) {
          meusVeiculos[i] = new Caminhao();
          System.out.println("Saiu Caminhao...: "+var);
          meusVeiculos[i].exibirInfo();
        }

      }*/

      //carro.exibirInfo();
      //moto.exibirInfo();
      //moto2.exibirInfo();
      //caminhao.exibirInfo();

      //for(int i = 0; i < 6; i++) System.out.println(tipoCarga[aleatorio.nextInt(6)]);
      //for(int i = 0; i < 4; i++) System.out.println(marcaVeiculo[aleatorio.nextInt(4)]);
      try {
        threadCRUD t1, t2;
        t1 = new threadCRUD(1, 5, 500, meusVeiculos);
        t2 = new threadCRUD(2, 5, 800, meusVeiculos);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Depois de tudo:  ");
        for(int j = 0; j < 5; j++) meusVeiculos[j].exibirInfo();
        
      } catch (Exception e) {
        //TODO: handle exception
      }
      

    }
  
}
