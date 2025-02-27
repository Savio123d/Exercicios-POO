public class Pessoa {
    String nome;
    int idade;

    void informa(){
         System.out.format("Seu nome: " + this.nome + " e Sua idade é: " + this.idade);
     }
     void  fazerAniversario(){
        System.out.format("PARABENS VC ACABOU DE COMPLETAR " + this.idade+1);
     }
}
