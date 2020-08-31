import java.util.Random;

public class threadCRUD extends Thread{
    private Random aleatorio;
    private Veiculo[] veiculos;
    private int id;
    private int quantidade;
    private int tempo;
    private String[] marcaVeiculo;
    private String[] tipoCarga;

    public threadCRUD(int id, int quantidade, int tempo, Veiculo[] veiculos){
        this.aleatorio = new Random();
        this.id = id;
        this.quantidade = quantidade;
        this.tempo = tempo;
        this.veiculos = veiculos;
        this.marcaVeiculo = new String[] {"Ford", "Honda", "Peugeot", "Volkswagen"};
        this.tipoCarga = new String[] {"VUC", "3/4", "Toco", "Truck", "Bitruck", "Cavalo mecanico 4x2"};
    }

    public void run(){
        try {
            //CRUD - Inserir
            if(id == 1){
                for(int i = 0; i < quantidade; i++){
                    System.out.println("Thread ID: "+id+" Inserindo...");
                    int catV = aleatorio.nextInt(3);
                    if(catV == 0) {
                        veiculos[i] = new Carro("Carro", "Carro-"+i, marcaVeiculo[aleatorio.nextInt(4)], "Modelo-"+i, "##"+aleatorio.nextInt(250), "BRA"+aleatorio.nextInt(10)+"P"+aleatorio.nextInt(10)+aleatorio.nextInt(10), "Alcool", (2000+aleatorio.nextInt(21)), 100*aleatorio.nextInt(6), aleatorio.nextInt(1000), (1000*aleatorio.nextInt(200)), 5, 4, "Sim", "Nao", "Sim");
                      }
                      if(catV == 1) {
                        veiculos[i] = new Moto("Moto", "Moto-"+i, marcaVeiculo[aleatorio.nextInt(4)], "Modelo-"+i, "##"+aleatorio.nextInt(250), "BRA"+aleatorio.nextInt(10)+"P"+aleatorio.nextInt(10)+aleatorio.nextInt(10), "Gasolina", (2000+aleatorio.nextInt(21)), 100*aleatorio.nextInt(6), aleatorio.nextInt(1000), (1000*aleatorio.nextInt(50)), 1, 2, 100*aleatorio.nextInt(5));
                      }
                      if(catV == 2) {
                        veiculos[i] = new Caminhao("Caminhao", "Caminhao-"+i, marcaVeiculo[aleatorio.nextInt(4)], "Modelo-"+i, "##"+aleatorio.nextInt(250), "BRA"+aleatorio.nextInt(10)+"P"+aleatorio.nextInt(10)+aleatorio.nextInt(10), "Diesel", (2000+aleatorio.nextInt(21)), 100*aleatorio.nextInt(6), aleatorio.nextInt(1000), (1000*aleatorio.nextInt(500)), 2, (4*aleatorio.nextInt(3)), (10+aleatorio.nextInt(10)), 1000*aleatorio.nextInt(200), "Fechada", tipoCarga[aleatorio.nextInt(6)]);
                      }
                    Thread.sleep(tempo);                
                }
            }
            //CRUD - Lendo
            if(id == 2){
                for(int i = 0; i < quantidade; i++){
                    System.out.println("Thread ID: "+id+" Lendo...");
                    //veiculos[i].exibirInfo();
                    Thread.sleep(tempo);
                }
            }
            //CRUD - Atualizando
            if(id == 3){
                for(int i = 0; i < quantidade; i++){
                    System.out.println("Thread ID: "+id+" Atualizando...");
                    Thread.sleep(tempo);
                    veiculos[i].updateMarca("Paulo");
                }
            }
            //CRUD - Excluindo
            if(id == 4){
                for(int i = 0; i < quantidade; i++){
                    System.out.println("Thread ID: "+id+" Excluindo...");
                    Thread.sleep(tempo);
                    veiculos[i]= new Veiculo();
                }
            }                 
        } catch (Exception e) {
            System.out.println("Erro na thread do CRUD "+e.getMessage());
        }
    }
}