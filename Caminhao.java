public class Caminhao extends Veiculo{

    private int comprimento;
    private int carga;
    private String carroceria; //aberta ou fechada
    private String modelocarga; //VUC, 3/4, Toco, Truck, Bitruck, Cavalo mecanico 4x2

    public Caminhao(){
        super();
        this.comprimento = 0;
        this.carga = 0;
        this.carroceria = "";
        this.modelocarga = "";
    }

    public Caminhao(String categoria, String nome, String marca, String modelo, String cor, String placa, String combustivel, int ano, int velocidade, int quilometragem, int valor, int quantassentos, int quantpneus, int comprimento, int carga, String carroceria, String modelocarga){
        super(categoria, nome, marca, modelo, cor, placa, combustivel, ano, velocidade, quilometragem, valor, quantassentos, quantpneus);
        this.comprimento = comprimento;
        this.carga = carga;
        this.carroceria = carroceria;
        this.modelocarga = modelo;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Comprimento: "+this.comprimento);
        System.out.println("Carga: "+this.carga);
        System.out.println("Carroceria: "+this.carroceria);
        System.out.println("Modelo: "+this.modelocarga);
    }
}