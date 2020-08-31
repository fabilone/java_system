public class Veiculos{

  private String nome;
  private String marca;
  private String modelo;
  private String cor;
  private String placa;
  private String combustivel;
  private int ano;
  private int velocidade;
  private int quilometragem;
  private int valor;

  public Veiculos(){
    this.nome = "";
    this.marca = "";
    this.modelo = "";
    this.cor = "";
    this.placa = "";
    this.combustivel = "";
    this.ano = 0;
    this.velocidade = 0;
    this.quilometragem = 0;
    this.valor = 0;
  }

  public Veiculos(String nome, String marca, String modelo, String cor, String placa, String combustivel, int ano, int velocidade, int quilometragem, int valor){
    this.nome = nome;
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.placa = placa;
    this.combustivel = combustivel;
    this.ano = ano;
    this.velocidade = velocidade;
    this.quilometragem = quilometragem;
    this.valor = valor;

  }

  public void exibirInfo(){
    System.out.println("-------------------------------------------------------");
    System.out.println("Nome: "+this.nome);
    System.out.println("Marca: "+this.marca);
    System.out.println("Modelo: "+this.modelo);
    System.out.println("Cor: "+this.cor);
    System.out.println("Placa: "+this.placa);
    System.out.println("Combustivel: "+this.ano);
    System.out.println("Velocidade: "+this.velocidade);
    System.out.println("Quilometragem: "+this.quilometragem);
    System.out.println("Valor do Veiculo: "+this.valor);
    System.out.println("-------------------------------------------------------");
  }

  public static void main(String[] args ){
    Carro carro = new Carro();
    carro.exibirInfo();
  }

}
