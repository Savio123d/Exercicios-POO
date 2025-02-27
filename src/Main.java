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
        System.out.printf("------------------------------------------------------------\n");
            Pessoa inf = new Pessoa();
            Scanner.nextLine();
            System.out.printf("Seu nome: ");
            inf.nome= Scanner.next();
            Scanner.nextLine();
            System.out.printf("Informe sua idade: ");
            inf.idade= Scanner.nextInt();
            inf.informa();
        System.out.printf("\n------------------------------------------------------------\n");
        String anv;
        System.out.printf("Vai fazer aniversario ? ");
        anv = Scanner.next();
        if (anv.equalsIgnoreCase("S") || anv.equalsIgnoreCase("Sim")) {
            inf.fazerAniversario();
        }
    }
}