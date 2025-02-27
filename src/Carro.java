public class Carro {
    String marca;
    String modelo;
    short ano;


    void chama(){
        System.out.format("Marca: %s - Modelo: %s - Ano: %d.\n", this.marca, this.modelo, this.ano);
    }
}
