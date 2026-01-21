package if_else;

import java.util.Scanner;

public class if_else1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo;
        int quantidade ;
        double valorTotal = 0;
        boolean valido = false;

        do {
            System.out.println("Insira o codigo do item: \n 1.Cachorro Quente \n 2.X-Salada \n 3.X-Bacon \n 4.Torrada Simples \n 5.Refrigerante \n");

            System.out.println("Quantidade: ");

            if (codigo == 1) {
                valorTotal = quantidade * 4.00;
            }
            else if (codigo == 2) {
                valorTotal = quantidade * 4.50;
            }
            else if (codigo == 3) {
                valorTotal = quantidade * 5.00;
            }
            else if (codigo == 4) {
                valorTotal = quantidade * 2.00;
            }
            else if (codigo == 5) {
                valorTotal = quantidade * 1.50;
            }
            else {
                System.out.println("Codigo nao existente.");
            }
        } while () ;

        System.out.println("O valor total sera de: " + valorTotal);

        sc.close();
        }
    }