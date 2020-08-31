public class Caminhao extends Veiculo{

    private int comprimento;
    private int carga;
    private String carroceria;
    private String[] modelo;

    public Caminhao(){
        super();
        this.comprimento = 0;
        this.carga = 0;
        this.carroceria = "";
        this.modelo = new String[] {"VUC", "3/4", "Toco", "Truck", "Bitruck", "Cavalo mecanico 4x2"};
    }

    public void printModelo(){
        for(int i = 0; i < 6; ++i) System.out.println(this.modelo[i]);
    }
}