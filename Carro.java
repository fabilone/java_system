public class Carro extends Veiculo{

    private String freioABS;
    private String tracaoDianteira;
    private String cintoTresPontos;

    public Carro(){
        super();
        this.freioABS = "";
        this.tracaoDianteira = "";
        this.cintoTresPontos = "";
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Freio ABS: "+this.freioABS);
        System.out.println("Tracao dianteira: "+this.tracaoDianteira);
        System.out.println("Cinto de tres pontos: "+this.cintoTresPontos);
    }


    
}