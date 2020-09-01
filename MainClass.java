public class MainClass{
    
    public static void main(String[] args ){

      Veiculo[] meusVeiculos = new Veiculo[5];

      try {
        threadCRUD t1, t2, t3, t4;
        t1 = new threadCRUD(1, 5, 500, meusVeiculos); //Thread de Insercao
        t2 = new threadCRUD(2, 5, 800, meusVeiculos); //Thread de Leitura
        t3 = new threadCRUD(3, 5, 1200, meusVeiculos); //Thread de Atualizacao
        t4 = new threadCRUD(4, 5, 4000, meusVeiculos); //Thread de Exclusao

        t1.start(); //iniciando Thread de insercao
        t2.start(); //iniciando Thread de leitura
        t3.start(); //iniciando Thread de atualizacao
        t4.start(); //iniciando Thread de exclusao

        //Aguadando resultados das Threads
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("\n\n-------------------------------------------------------");
        System.out.println("Depois de tudo:  ");
        for(int j = 0; j < 5; j++) meusVeiculos[j].exibirInfo();
        
      } catch (Exception e) {
        System.out.println("Erro na thread do MAIN "+e.getMessage());
      }     

    }
  
}
