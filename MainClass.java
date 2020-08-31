import java.util.Random;

public class MainClass{
    
    public static void main(String[] args ){

      Random aleatorio = new Random(); 
      String[] tipoCarga = new String[] {"VUC", "3/4", "Toco", "Truck", "Bitruck", "Cavalo mecanico 4x2"};
      String[] marcaVeiculo = new String[] {"Ford", "Honda", "Peugeot", "Volkswagen"}; 

      Carro carro = new Carro();
      Veiculo moto = new Veiculo();
      Moto moto2 = new Moto();
      Caminhao caminhao = new Caminhao();

      carro.exibirInfo();
      moto.exibirInfo();
      moto2.exibirInfo();
      caminhao.exibirInfo();

      for(int i = 0; i < 6; i++) System.out.println(tipoCarga[aleatorio.nextInt(6)]);
      for(int i = 0; i < 4; i++) System.out.println(marcaVeiculo[aleatorio.nextInt(4)]);
    }
  
}
