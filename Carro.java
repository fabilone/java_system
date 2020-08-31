public class Carro extends Veiculos{

    private int quantassentos;
    private int quantpneus; 

    public Carro(){
        super();
        this.quantassentos = 0;
        this.quantpneus = 0;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Quantidade de assentos: "+this.quantassentos);
        System.out.println("Quantidade de pneus: "+this.quantpneus);
    }


    
}