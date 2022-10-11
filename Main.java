class NovoPersonagem {

  String nome;
  
  String raca;
  
  int nivel;
  
  String cla;
  
  Boolean lider;

    public NovoPersonagem(int ID) {
      this.nome = "Alberto";
        
      this.raca = "Gnomo";
      
      this.nivel = 5;
      
      this.cla = "Gnomios";

      this.lider = false;
    }
  public void imprimeNovo() {
    System.out.println("Este novo personagem tem nome: " + this.nome + ", é da Raça: " + this.raca + " tem o nível: " + this.nivel + " é do clâ: " + this.cla + " e tem seu status de lider como: " + this.lider);
}
}


//Aqui temos a criação da Classe Personagem
class Personagem {

  String nome;

  String tipo;

  int nivel;

  protected int id;

//Aqui declaramos o primeiro personagem que criamos 
  public Personagem(int ID) {

    this.id = ID;

    this.nome = "Guilherme";

    this.tipo = "Elfo";

    this.nivel = 10;

  }

//Nesta função, imprimimos os dados do primeiro personagem criado. 
  public void imprimeDados() {

    System.out.println("Personagem do tipo " + this.tipo + " com ID = " + this.id);

    System.out.println("Possui nivel " + this.nivel + " e se chama  " + this.nome);

  }

}

//Aqui temos um exemplo de herança em POO, onde criamos a classe Dragão, que tem os mesmos parametros do Personagem
class Dragao extends Personagem {

  int peso;

  int atividade;

  boolean ocupado;

 
  public Dragao(int ID) {

    super(ID);

    this.tipo = "dragao";

    this.nome = "indefinido";

    this.atividade = 0;

    this.ocupado = false;

  }

 
  public Dragao(int ID, String nome) {

    super(ID);

    this.tipo = "dragao";

    this.nome = nome;

    this.atividade = 0;

    this.ocupado = false;

  }

 
  public void atuar(int Personagem){

    this.imprimeDados();

    System.out.println("Executa esta função com o tipo declarado no main " + Personagem);

  }

}

 
public class Main {

  public static void main(String[] args) {

    System.out.println("Atividade de produção - Guilherme Vinicios Tramontin - 202010215");

    Personagem p = new Personagem(1);

    p.imprimeDados();

    NovoPersonagem o = new NovoPersonagem(0);

    o.imprimeNovo();

    Dragao d1 = new Dragao(2, "Hades");

    d1.atuar(5);


  }

}