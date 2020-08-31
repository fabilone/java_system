public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(){
        super();
        this.cilindradas = 0;
    }

    public Moto(String categoria, String nome, String marca, String modelo, String cor, String placa, String combustivel, int ano, int velocidade, int quilometragem, int valor, int quantassentos, int quantpneus, int cilindradas){
        super(categoria, nome, marca, modelo, cor, placa, combustivel, ano, velocidade, quilometragem, valor, quantassentos, quantpneus);
        this.cilindradas = cilindradas;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Cilindradas: "+this.cilindradas);
    }

    
}