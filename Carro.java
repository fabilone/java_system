public class Carro extends Veiculo{

    private String freioABS; //Sim ou Nao
    private String tracaoDianteira; //Sim ou Nao
    private String cintoTresPontos; //Sim ou Nao

    public Carro(){
        super();
        this.freioABS = "";
        this.tracaoDianteira = "";
        this.cintoTresPontos = "";
    }

    public Carro(String categoria, String nome, String marca, String modelo, String cor, String placa, String combustivel, int ano, int velocidade, int quilometragem, int valor, int quantassentos, int quantpneus, String freioABS, String tracaoDianteira, String cintoTresPontos){
        super(categoria, nome, marca, modelo, cor, placa, combustivel, ano, velocidade, quilometragem, valor, quantassentos, quantpneus);
        this.freioABS = freioABS;
        this.tracaoDianteira = tracaoDianteira;
        this.cintoTresPontos = cintoTresPontos;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Freio ABS: "+this.freioABS);
        System.out.println("Tracao dianteira: "+this.tracaoDianteira);
        System.out.println("Cinto de tres pontos: "+this.cintoTresPontos);
    }


    
}