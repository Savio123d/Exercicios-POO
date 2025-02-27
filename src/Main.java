import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
           Carro c1 = new Carro();
            System.out.printf("Informe a Marca do carro: ");
            c1.marca = Scanner.next();
            System.out.printf("Informe Modelo do carro: ");
            c1.modelo = Scanner.next();
            System.out.printf("Informe o ano: ");
            c1.ano = Scanner.nextShort();
            c1.chama();
    }
}