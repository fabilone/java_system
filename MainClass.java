import java.util.Random;

public class MainClass{
    
    public static void main(String[] args ){

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

      for(int i = 0; i < 6; i++) System.out.println(tipoCarga[i]);
      for(int i = 0; i < 4; i++) System.out.println(marcaVeiculo[i]);
    }
  
}
