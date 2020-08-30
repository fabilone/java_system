public class Veiculos{

  private String nome;
  private String marca;
  private String potencia;
  private int valor;

  public Veiculos(String nome, String marca, String potencia, int valor){
    this.nome = nome;
    this.marca = marca;
    this.potencia = potencia;
    this.valor = valor;
  }

  public void mostrarinfo(){
    System.out.println("Nome: "+this.nome);
    System.out.println("Marca: "+this.marca);
    System.out.println("Potencia: "+this.potencia);
    System.out.println("Valor do Veículo: "+this.valor);
  }

  public static void main(String[] args ){
    Veiculos carro = new Veiculos("Gol", "Fiate", "200cv", 10000);
    carro.mostrarinfo();
  }

}
